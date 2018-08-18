package com.capgemini.storeserver.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.storeserver.beans.Category;
import com.capgemini.storeserver.beans.Coupon;
import com.capgemini.storeserver.beans.Customer;
import com.capgemini.storeserver.beans.Merchant;
import com.capgemini.storeserver.beans.Product;
import com.capgemini.storeserver.repo.AdminRepo;
import com.capgemini.storeserver.repo.CategoryRepo;
import com.capgemini.storeserver.repo.CouponRepo;
import com.capgemini.storeserver.repo.CustomerRepo;
import com.capgemini.storeserver.repo.MerchantRepo;
import com.capgemini.storeserver.repo.ProductRepo;

@Service(value="adminServices")
public class AdminServicesImpl implements AdminServices {
	
	@Autowired
	private AdminRepo adminRepo;

	@Autowired
	private MerchantRepo merchantRepo;
	

	@Override
	public Merchant addMerchant(Merchant merchant) {
		
		return merchantRepo.save(merchant);
	}
	
	@Override
	public void removeMerchant(int merchantId) {

		merchantRepo.deleteById(merchantId);
	}
	@Autowired
	private CouponRepo couponRepo;
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public List<Product> viewAllProducts() {
		System.out.println(productRepo.findAll());

		return productRepo.findAll();
	}

	@Override
	@Transactional
	public Category updateCategory(int categoryId, String categoryName, String type) {
		Category category = categoryRepo.updateCategory(categoryId);
		category.setCategoryName(categoryName);
		category.setType(type);
		return category;

	}
	
	@Override
	public Coupon addCoupon(Coupon coupon) {
		
		return couponRepo.save(coupon);
	}
	
	@Override
	public void removeCoupon(int couponId) {
		couponRepo.deleteById(couponId);

	}
	
	@Override
	public List<Customer> viewAllCustomer() {
	
		return customerRepo.findAll();
	}
	
}
