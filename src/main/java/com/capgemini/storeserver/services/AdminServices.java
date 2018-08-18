package com.capgemini.storeserver.services;

import com.capgemini.storeserver.beans.Discount;
import com.capgemini.storeserver.beans.Merchant;


public interface AdminServices {
	
	public Merchant addMerchant(Merchant merchant);
	public Discount addDiscount(Discount discount);
	
}
