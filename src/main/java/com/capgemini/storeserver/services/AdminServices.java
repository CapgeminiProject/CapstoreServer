package com.capgemini.storeserver.services;

import java.util.List;

import com.capgemini.storeserver.beans.Customer;
import com.capgemini.storeserver.beans.Merchant;


public interface AdminServices {
	
	public Merchant addMerchant(Merchant merchant);
	
	public List<Customer> viewAllCustomer();
	
}
