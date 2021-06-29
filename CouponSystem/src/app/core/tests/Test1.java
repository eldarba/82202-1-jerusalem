package app.core.tests;

import app.core.dao.CompaniesDAO;
import app.core.dao.CompaniesDaoDb;
import app.core.exceptions.CouponSystemException;

public class Test1 {

	public static void main(String[] args) throws CouponSystemException {
		CompaniesDAO companiesDAO = new CompaniesDaoDb();
		if (companiesDAO.isCompanyExist("aaa@mail", "pass")) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}

	}

}
