package com.deepag.demo.springdatamongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepag.demo.springdatamongo.dao.ProductRepository;
import com.deepag.demo.springdatamongo.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public void saveProduct(Product product) {
		productRepository.save(product);
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}

	public Product getProductById(Long productId) {
		return productRepository.findById(productId).get();
	}
	
	public Product getProductByName(String productName) {
		return productRepository.getProductByName(productName);
	}
}
