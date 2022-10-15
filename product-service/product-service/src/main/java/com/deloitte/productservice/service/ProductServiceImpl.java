package com.deloitte.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.deloitte.productservice.model.Product;
import com.deloitte.productservice.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}

	public List<Product> getProductList(){
		return productRepo.findAll();
	}

}
