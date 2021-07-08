package coupon.system.core.dao;

import coupon.system.core.beans.Coupon;
import coupon.system.core.exceptions.CouponSystemException;

public interface CouponDao {

	/**
	 * @param coupon the coupon to add
	 * @return the coupon id
	 * @throws CouponSystemException
	 */
	int createCoupon(Coupon coupon) throws CouponSystemException;

	/**
	 * @param couponId
	 * @return
	 * @throws CouponSystemException if the coupon not found
	 */
	Coupon getCoupon(int couponId) throws CouponSystemException;

}
