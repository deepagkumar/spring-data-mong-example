package com.deepag.demo.springdatamongo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "myproduct")
public class Product {

	@Id
	private Long productId;
	
	private String productName;
	
	private Date dateOfMfg;
	
	private Double price;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getDateOfMfg() {
		return dateOfMfg;
	}

	public void setDateOfMfg(Date dateOfMfg) {
		this.dateOfMfg = dateOfMfg;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", dateOfMfg=" + dateOfMfg
				+ ", price=" + price + "]";
	}

}
