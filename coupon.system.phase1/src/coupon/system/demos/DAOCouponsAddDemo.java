package coupon.system.demos;

import java.time.LocalDate;

import coupon.system.core.beans.Company;
import coupon.system.core.beans.Coupon;
import coupon.system.core.dao.CompanyDao;
import coupon.system.core.dao.CompanyDaoDb;
import coupon.system.core.dao.CouponDao;
import coupon.system.core.dao.CouponDaoDb;
import coupon.system.core.db.ConnectionPool;
import coupon.system.core.exceptions.CouponSystemException;

public class DAOCouponsAddDemo {

	public static void main(String[] args) {
		try {
			CouponDao couponDao = new CouponDaoDb();
			Coupon coupon = new Coupon();
			coupon.setAmount(5);
			coupon.setCategory(Coupon.Category.ELECTRICITY);
			coupon.setCompanyId(1);
			coupon.setDescription("tester coupon");
			coupon.setStartDate(LocalDate.of(2021, 8, 7));
			coupon.setEndDate(LocalDate.of(2022, 8, 7));
			coupon.setImage("img");
			coupon.setPrice(15.80);
			coupon.setTitle("washing machine");
			couponDao.createCoupon(coupon);
			System.out.println("Added");
			System.out.println(coupon);
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
