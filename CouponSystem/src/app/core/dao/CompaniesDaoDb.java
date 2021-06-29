package app.core.dao;

import java.sql.Connection;

import app.core.db.ConnectionPool;
import app.core.exceptions.CouponSystemException;

public class CompaniesDaoDb implements CompaniesDAO {

	@Override
	public boolean isCompanyExist(String email, String password) throws CouponSystemException {
		// get a connection from the pool
		Connection con = ConnectionPool.getInstance().getConnection();
		// do the sql queries
		// return connection to the pool
		ConnectionPool.getInstance().restoreConnection(con);
		return true;
	}

}
