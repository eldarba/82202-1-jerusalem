package coupon.system.core.facade;

import coupon.system.core.dao.CompanyDao;
import coupon.system.core.dao.CouponDao;
import coupon.system.core.dao.CustomerDao;

public abstract class ClientFacade {

	protected CompanyDao companyDao;
	protected CustomerDao customerDao;
	protected CouponDao couponDao;

	public ClientFacade(CompanyDao companyDao, CustomerDao customerDao, CouponDao couponDao) {
		super();
		this.companyDao = companyDao;
		this.customerDao = customerDao;
		this.couponDao = couponDao;
	}

	public abstract boolean login(String email, String password);

}
