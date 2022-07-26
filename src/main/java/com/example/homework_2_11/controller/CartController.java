package com.example.homework_2_11.controller;

import com.example.homework_2_11.model.Cart;
import com.example.homework_2_11.service.CartService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

@RestController
@SessionScope
@RequestMapping("/order")

public class CartController {

    private CartService cartService;

    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    @GetMapping("/get")
    public Cart getCart() {
        return cartService.getCart();
    }

    @GetMapping("/add")
    public Cart addition(@RequestParam("newItems") String newItems) {
        return cartService.addToCart(newItems);
    }



}
