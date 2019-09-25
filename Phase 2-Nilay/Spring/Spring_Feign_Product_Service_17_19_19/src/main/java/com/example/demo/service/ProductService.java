package com.example.demo.service;

import java.util.List;

import com.example.demo.shared.ProductDto;

public interface ProductService {

	
	public ProductDto createUser(ProductDto theProductDto);
	
	public List<ProductDto> getAllProducts();
	
	public ProductDto getProductById(int id);
	
	public void deleteById(int id);
}