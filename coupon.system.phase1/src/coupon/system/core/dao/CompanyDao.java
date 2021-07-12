package coupon.system.core.dao;

import java.util.List;

import coupon.system.core.beans.Company;
import coupon.system.core.exceptions.CouponSystemException;

public interface CompanyDao {

	boolean isCompanyExist(String email, String password) throws CouponSystemException;

	/**
	 * @param company the company to add.
	 * @return the id generated for the newly created company.
	 * @throws CouponSystemException
	 */
	int addCompany(Company company) throws CouponSystemException;

	/**
	 * @param company the company to update
	 * @throws CouponSystemException if the specified company not found
	 */
	void updateCompany(Company company) throws CouponSystemException;

	void deleteCompany(int companyId) throws CouponSystemException;

	List<Company> getAllCompanies() throws CouponSystemException;

	Company getOneCompany() throws CouponSystemException;

}
