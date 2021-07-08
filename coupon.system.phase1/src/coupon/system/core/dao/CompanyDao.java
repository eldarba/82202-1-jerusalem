package coupon.system.core.dao;

import coupon.system.core.beans.Company;
import coupon.system.core.exceptions.CouponSystemException;

public interface CompanyDao {

	int createCompany(Company company) throws CouponSystemException;

	/**
	 * @param company the company to update
	 * @throws CouponSystemException if the specified company not found
	 */
	void updateCompany(Company company) throws CouponSystemException;

}
