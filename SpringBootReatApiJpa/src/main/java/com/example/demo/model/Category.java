package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Category implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int category_id;
	
	private String name;
	
	@ManyToMany(mappedBy = "category", fetch = FetchType.LAZY)
	@JsonIgnoreProperties("category")
	//@JoinTable(name="product_category",joinColumns=@JoinColumn(name="product_id"),inverseJoinColumns=@JoinColumn(name="category_id"))
	private List<Product> product=new ArrayList<>();

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	public Category(int category_id, String name, List<Product> product) {
		super();
		this.category_id = category_id;
		this.name = name;
		this.product = product;
	}

	public Category() {
		super();
		
	}

	
	

}
