package coupon.system.core.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import coupon.system.core.exceptions.CouponSystemException;

public class ConnectionPool {

	private Set<Connection> connections = new HashSet<Connection>();
	private String url = "jdbc:mysql://localhost:3306/coupon_sys_db";
	private String user = "root";
	private String pass = "1234";
	private boolean poolOpen;

	public static final int MAX = 10;

	private static ConnectionPool instance;

	private ConnectionPool() throws SQLException {
		for (int i = 0; i < MAX; i++) {
			this.connections.add(DriverManager.getConnection(url, user, pass));
		}
		System.out.println("connection pool initialized with " + connections.size());
		poolOpen = true;
	}

	public static ConnectionPool getInstance() throws CouponSystemException {
		if (instance == null) {
			try {
				instance = new ConnectionPool();
			} catch (SQLException e) {
				throw new CouponSystemException("connection pool init failed", e);
			}
		}
		return instance;
	}

	public synchronized Connection getConnection() throws CouponSystemException {
		if (!poolOpen) {
			throw new CouponSystemException("getConnection failed - pool is closed");
		}
		// 1. while there are no connections - wait
		while (this.connections.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 2. when connections are available - remove one from the set and return it
		// a. get an iterator over the connections set
		Iterator<Connection> it = this.connections.iterator();
		// b. get a reference to a connection by calling next()
		Connection con = it.next();
		// c. remove the current connection by calling Iterator.remove()
		it.remove();
		// d. return the connection
		return con;
	}

	public synchronized void restoreConnection(Connection con) {
		this.connections.add(con);
		notify();
	}

	public synchronized void closeAllConnections() throws CouponSystemException {
		// close the pool
		this.poolOpen = false;
		// wait for all connections to return
		while (this.connections.size() < MAX) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// after all connection returned - close all of them
		try {
			for (Connection connection : connections) {
				connection.close();
			}
		} catch (SQLException e) {
			throw new CouponSystemException("closeAllConnections faild", e);
		}
	}

}
