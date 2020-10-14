package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CategoryRepository;
import com.example.demo.dao.ProductRepository;
import com.example.demo.model.Category;
import com.example.demo.model.Product;

@Service
public class ServiceImpl implements ServiceI{

    @Autowired
    private ProductRepository proRepo;
    
    @Autowired
    private CategoryRepository catRepo;
	
	@Override
	public List<Product> addProduct(List<Product> e) {
		List<Product> list=proRepo.saveAll(e);
		System.out.println("Save Product Data");
		return list;
		
	}

	@Override
	public Product getProduct(int product_id) {
		Product p=proRepo.findById(product_id).get();
		return p;
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> list=proRepo.findAll();
		return list;
	}

	@Override
	public List<Category> addCategory(List<Category> e) {
		List<Category> list=catRepo.saveAll(e);
		return list;
	}

	@Override
	public Category getCategory(int category_id) {
		Category c=catRepo.findById(category_id).get();
		return c;
	}

	@Override
	public List<Category> getAllCategory() {
		List<Category> list=catRepo.findAll();
		return list;
	}

	@Override
	public List<Product> updateProduct(List<Product> product) {
		proRepo.saveAll(product);
		List<Product> list=proRepo.findAll();
		return list;
	}
}
