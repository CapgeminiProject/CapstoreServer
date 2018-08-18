package com.capgemini.storeserver.services;

import java.util.List;

import com.capgemini.storeserver.beans.Category;
import com.capgemini.storeserver.beans.Merchant;
import com.capgemini.storeserver.beans.Product;


public interface AdminServices {
	
	public Merchant addMerchant(Merchant merchant);
	
public List<Product> viewAllProducts();
	
	Category updateCategory(int categoryId, String categoryName,String type);

	
}
