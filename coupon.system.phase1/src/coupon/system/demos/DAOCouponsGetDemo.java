package coupon.system.demos;

import coupon.system.core.beans.Coupon;
import coupon.system.core.dao.CouponDao;
import coupon.system.core.dao.CouponDaoDb;
import coupon.system.core.db.ConnectionPool;
import coupon.system.core.exceptions.CouponSystemException;

public class DAOCouponsGetDemo {

	public static void main(String[] args) {
		try {
			CouponDao couponDao = new CouponDaoDb();
			Coupon coupon = couponDao.getCoupon(2);
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
