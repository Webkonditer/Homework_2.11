package com.example.homework_2_11.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.Map;

@Component
@SessionScope

public class Cart {

    private Map<Integer, Integer> cart;

    public Cart() {
        this.cart = new HashMap<>();
    }

    public Map<Integer, Integer> getCart() {
        return cart;
    }

    public Map<Integer, Integer> addToCart(Integer item) {
        if (cart.containsKey(item)) {
            cart.put(item, cart.get(item) + 1);
        } else {
            cart.put(item, 1);
        }
        return cart;
    }
}



