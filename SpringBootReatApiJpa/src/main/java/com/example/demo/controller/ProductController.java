package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProductRepository;
import com.example.demo.model.Product;
import com.example.demo.service.ServiceI;

@RestController
public class ProductController {

	@Autowired
	private ServiceI service;
	
	@Autowired
    private ProductRepository proRepo;
    
	@PostMapping("/addProduct")
	public List<Product> saveProduct(@RequestBody List<Product> product)
	{
		List<Product> list=service.addProduct(product);
		return list;
	}
	
	@GetMapping("/getSingleProduct/{product_id}")
	public Product getSingleProduct(@PathVariable("product_id") int product_id)
	{
		Product p=service.getProduct(product_id);
		return p;
	}
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct()
	{
		List<Product> p=service.getAllProduct();
		return p;
	}
	
	@PutMapping("/updateProduct")
	public List<Product> updateProduct(@RequestBody List<Product> product)
	{
		return service.updateProduct(product);
	}
	
}
