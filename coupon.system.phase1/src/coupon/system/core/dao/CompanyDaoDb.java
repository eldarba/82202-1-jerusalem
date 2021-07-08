package coupon.system.core.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import coupon.system.core.beans.Company;
import coupon.system.core.db.ConnectionPool;
import coupon.system.core.exceptions.CouponSystemException;

public class CompanyDaoDb implements CompanyDao {

	@Override
	public int createCompany(Company company) throws CouponSystemException {
		// get a connection from the pool
		Connection con = ConnectionPool.getInstance().getConnection();
		// set the SQL command as a String
		String sql = "insert into company values(0, ?, ?, ?)";
		// create a statement object to execute the SQL command
		try (PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {
			pstmt.setString(1, company.getName());
			pstmt.setString(2, company.getEmail());
			pstmt.setString(3, company.getPassword());
			pstmt.executeUpdate(); // the company goes to the database
			// now we want to know the id generated for the company:
			ResultSet rs = pstmt.getGeneratedKeys();
			rs.next();
			int autoGeneratedId = rs.getInt(1);
			company.setId(autoGeneratedId);
			return autoGeneratedId; // return the auto generated id
		} catch (SQLException e) {
			throw new CouponSystemException("createCompany failed", e);
		} finally {
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

}
