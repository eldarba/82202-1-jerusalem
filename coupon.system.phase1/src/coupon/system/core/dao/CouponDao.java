package coupon.system.core.dao;

import coupon.system.core.beans.Coupon;
import coupon.system.core.exceptions.CouponSystemException;

public interface CouponDao {

	int createCoupon(Coupon coupon) throws CouponSystemException;

}
