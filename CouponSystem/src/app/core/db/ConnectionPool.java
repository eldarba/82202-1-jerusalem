package app.core.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import app.core.exceptions.CouponSystemException;

public class ConnectionPool {

	private Set<Connection> connections = new HashSet<Connection>();
	private String url = "";
	private String user = "";
	private String pass = "";

	private static ConnectionPool instance;

	private ConnectionPool() throws SQLException {
		for (int i = 0; i < 10; i++) {
			this.connections.add(DriverManager.getConnection(url, user, pass));
		}
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
		return null;
	}

	public void restoreConnection(Connection con) {
		this.connections.add(con);
	}

}
