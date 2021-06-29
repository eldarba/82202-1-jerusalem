package app.core.dao;

import app.core.exceptions.CouponSystemException;

public interface CompaniesDAO {

	boolean isCompanyExist(String email, String password) throws CouponSystemException;

}
