package com.capgemini.storeserver.services;

import com.capgemini.storeserver.beans.Coupon;
import com.capgemini.storeserver.beans.Merchant;


public interface AdminServices {
	
	public Merchant addMerchant(Merchant merchant);
	public Coupon addCoupon(Coupon coupon);
	
}
