package com.deepag.demo.springdatamongo.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deepag.demo.springdatamongo.model.Product;
import com.deepag.demo.springdatamongo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method=RequestMethod.POST)
	public void saveEmployee(@RequestBody @Valid Product product) {
		productService.saveProduct(product);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/all")
	public List<Product> getAll() {
		return productService.getAllProducts();
	}


}
