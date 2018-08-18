package com.capgemini.storeserver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capgemini.storeserver.beans.Merchant;
import com.capgemini.storeserver.repo.AdminRepo;
import com.capgemini.storeserver.repo.CouponRepo;
import com.capgemini.storeserver.repo.MerchantRepo;

@Service(value="adminServices")
public class AdminServicesImpl implements AdminServices {
	
	@Autowired
	private AdminRepo adminRepo;

	@Autowired
	private MerchantRepo merchantRepo;
	
	@Autowired
	private CouponRepo couponRepo;

	@Override
	public Merchant addMerchant(Merchant merchant) {
		
		return merchantRepo.save(merchant);
	}
	
	@Override
	public void removeCoupon(int couponId) {
		couponRepo.deleteById(couponId);
		
	}
}
