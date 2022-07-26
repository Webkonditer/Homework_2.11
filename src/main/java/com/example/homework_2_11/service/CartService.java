package com.example.homework_2_11.service;

import com.example.homework_2_11.model.Cart;

public interface CartService {
    Cart getCart();

    Cart addToCart(String newItems);
}
