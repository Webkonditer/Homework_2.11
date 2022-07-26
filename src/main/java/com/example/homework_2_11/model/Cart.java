package com.example.homework_2_11.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.Map;


@Repository

public class Cart {

    private Map<Integer, Integer> cart;

    public Cart() {
        this.cart = new HashMap<>();
    }

    public Map getCart() {
        return cart;
    }

    public Map addToCart(Integer item) {
        if (cart.containsKey(item)) {
            cart.put(item, cart.get(item) + 1);
        } else {
            cart.put(item, 1);
        }
        return cart;

    }

    @Override
    public String toString() {
        return "cart = " + cart;
    }

//    public static void main(String[] args) {
//        Cart cart = new Cart();
//        cart.addToCart(33);
//        cart.addToCart(34);
//        cart.addToCart(35);
//        cart.addToCart(36);
//        cart.addToCart(33);
//
//        System.out.println(cart);
//
//        System.out.println(Integer.parseInt("33,44,55,66,77,88,33"));
//
//
//    }


}
