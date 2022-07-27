package com.example.homework_2_11.service;

import com.example.homework_2_11.model.Cart;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Scanner;

@Service
public class CartServiceImpl implements CartService {


    private Cart cart;
    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public Map<Integer, Integer> getCart() {
        return cart.getCart();
    }

    @Override
    public Map<Integer, Integer> addToCart(String newItems) {
        Scanner scanner = new Scanner(newItems);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            String item = scanner.next();
            if(isNumeric(item)){
                cart.addToCart(Integer.parseInt(item));
            } else{
                throw new RuntimeException();
            }
        }
        return cart.getCart();
    }

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
