package com.deloitte.cartservice.service;

import java.util.List;

import com.deloitte.cartservice.model.Cart;

public interface CartService {
	
	Cart addItemToCart(Cart cartItem);
	
	List<Cart> getUserCartByItems(Long userId);
}
