package coupon.system.demos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import coupon.system.core.db.ConnectionPool;
import coupon.system.core.exceptions.CouponSystemException;

public class GetTheAutoGeneratedIdDemo {

	public static void main(String[] args) {
		Connection con = null;
		try {
			// ========================================
			con = ConnectionPool.getInstance().getConnection();
			String sql = "insert into company values(0, ?,?,?)";
			// use - PreparedStatement.RETURN_GENERATED_KEYS
			// to store the generated ID
			PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, "Adidas");
			pstmt.setString(2, "adidas@mail");
			pstmt.setString(3, "adidasPass");
			pstmt.executeUpdate(); // do the actual insert in the db
			System.out.println(sql);
			// get the generated ID in a result set
			ResultSet rsKey = pstmt.getGeneratedKeys();
			rsKey.next();
			int companyId = rsKey.getInt(1);
			//
			System.out.println("the company id is: " + companyId);
			pstmt.close();
			// ========================================
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					ConnectionPool.getInstance().restoreConnection(con);
				} catch (CouponSystemException e) {
					e.printStackTrace();
				}
			}
			try {
				ConnectionPool.getInstance().closeAllConnections();
			} catch (CouponSystemException e) {
				e.printStackTrace();
			}
		}

	}

}
