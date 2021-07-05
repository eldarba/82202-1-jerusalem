package coupon.system.core.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import coupon.system.core.exceptions.CouponSystemException;

public class ConnectionPool {

	private Set<Connection> connections = new HashSet<Connection>();
	private String url = "jdbc:mysql://localhost:3306/coupon_sys_db";
	private String user = "root";
	private String pass = "1234";

	private static ConnectionPool instance;

	private ConnectionPool() throws SQLException {
		for (int i = 0; i < 10; i++) {
			this.connections.add(DriverManager.getConnection(url, user, pass));
		}
		System.out.println("connection pool initialized with " + connections.size());
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

	public Connection getConnection() {
		// 1. while there are no connections - wait
		// 2. when connections are available - remove one from the set and return it
		return null;
	}

	public void restoreConnection(Connection con) {
		this.connections.add(con);
	}

}
