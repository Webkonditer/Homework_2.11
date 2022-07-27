package com.example.homework_2_11.service;

import java.util.Map;

public interface CartService {
    Map<Integer, Integer> getCart();

    Map<Integer, Integer> addToCart(String newItems);
}
