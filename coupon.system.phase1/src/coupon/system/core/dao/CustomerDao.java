package coupon.system.core.dao;

import java.util.List;

import coupon.system.core.beans.Company;
import coupon.system.core.beans.Customer;
import coupon.system.core.exceptions.CouponSystemException;

public interface CustomerDao {

	boolean isCustomerExist(String email, String password) throws CouponSystemException;

	int addCustomer(Customer customer) throws CouponSystemException;

	//

	void updateCompany(Company company) throws CouponSystemException;

	void deleteCompany(int companyId) throws CouponSystemException;

	List<Company> getAllCompanies() throws CouponSystemException;

	Company getOneCompany() throws CouponSystemException;

}
