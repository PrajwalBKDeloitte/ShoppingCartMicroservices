package com.deloitte.cartservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.cartservice.model.Cart;
import com.deloitte.cartservice.service.CartServiceImpl;

@RestController
public class CartServiceController {
	
	@Autowired 
	private CartServiceImpl cartService;
	

	@PostMapping("/addItemToCart")
	public Cart addItemToCart(@RequestBody Cart cartItem) {
		
		Cart c;
		try {
			c = cartService.addItemToCart(cartItem);
		}catch(Exception e) {
			c = new Cart(cartItem.getUserId(), cartItem.getProductId(), e.getMessage(),cartItem.getQuantity());
		}
		return c;
	}
	
	@PostMapping("/getCart")
	public List<Cart> findByUserId(@RequestBody Long userId){
		return cartService.getUserCartByItems(userId);
		
	}
	
}
