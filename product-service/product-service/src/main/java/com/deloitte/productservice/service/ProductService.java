package com.deloitte.productservice.service;

import java.util.List;



import com.deloitte.productservice.model.Product;

public interface ProductService {

	Product addProduct(Product product);	
	
	List<Product> getProductList();
	
}
