package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Category;
import com.example.demo.model.Product;

public interface ServiceI {
    
	List<Product> addProduct(List<Product> e);
	
	Product getProduct(int product_id);
	
	List<Product> getAllProduct();
	
	List<Product> updateProduct(List<Product> product);
	
	
    List<Category> addCategory(List<Category> e);
	
    Category getCategory(int category_id);
	
	List<Category> getAllCategory();
}
