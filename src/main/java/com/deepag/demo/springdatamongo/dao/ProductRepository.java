package com.deepag.demo.springdatamongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.deepag.demo.springdatamongo.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
	
	@Query(value =" { 'productName' : ?0 } ")
	public Product getProductByName(String productName);

}
