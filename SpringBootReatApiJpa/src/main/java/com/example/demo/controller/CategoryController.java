package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.service.ServiceI;

@RestController
public class CategoryController {
	@Autowired
	private ServiceI service;
	
	@PostMapping("/addCategory")
	public List<Category> saveCategory(@RequestBody List<Category> category)
	{
		List<Category> list=service.addCategory(category);
		return list;
	}
	
	@GetMapping("/getSingleCategory/{category_id}")
	public Category getSingleCategory(@PathVariable("category_id") int category_id)
	{
		Category p=service.getCategory(category_id);
		return p;
	}
	
	@GetMapping("/getAllCategory")
	public List<Category> getAllCategory()
	{
		List<Category> p=service.getAllCategory();
		return p;
	}
}
