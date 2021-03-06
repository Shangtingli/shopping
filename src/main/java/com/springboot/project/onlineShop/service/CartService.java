package com.springboot.project.onlineShop.service;

import com.springboot.project.onlineShop.model.Cart;

import java.io.IOException;

public interface CartService {
    Cart getCartById(Long CartId);

    Cart validate(Long cartId) throws IOException;

    void update(Cart cart);
}
