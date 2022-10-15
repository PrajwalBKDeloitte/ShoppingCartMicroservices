package com.deloitte.cartservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.cartservice.model.Cart;
import com.deloitte.cartservice.repo.CartRepo;
import com.netflix.discovery.converters.Auto;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartRepo cartRepo;
	
	@Override
	public Cart addItemToCart(Cart cartItem) {
		return cartRepo.save(cartItem);
	}

	@Override
	public List<Cart> getUserCartByItems(Long userId) {
		return cartRepo.findByUserId(userId);
	}

	

}
