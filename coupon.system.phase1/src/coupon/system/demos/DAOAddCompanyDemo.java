package coupon.system.demos;

import coupon.system.core.beans.Company;
import coupon.system.core.dao.CompanyDao;
import coupon.system.core.dao.CompanyDaoDb;
import coupon.system.core.db.ConnectionPool;
import coupon.system.core.exceptions.CouponSystemException;

public class DAOAddCompanyDemo {

	public static void main(String[] args) {
		try {
			// create a company
			Company company = new Company();
			// set company state
			company.setName("MMM");
			company.setEmail("mmm@Mail");
			company.setPassword("mmmPass");
			// create a DAO
			CompanyDao companyDao = new CompanyDaoDb();
			// use the DAO to add the company to the database
			int id = companyDao.createCompany(company);
			// print the created company
			System.out.println(id);
			System.out.println(company);
		} catch (CouponSystemException e) {
			e.printStackTrace();
		} finally {
			try {
				ConnectionPool.getInstance().closeAllConnections();
			} catch (CouponSystemException e) {
				e.printStackTrace();
			}
		}
	}

}
