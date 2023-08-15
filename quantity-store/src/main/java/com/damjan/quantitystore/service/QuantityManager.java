package com.damjan.quantitystore.service;

import com.damjan.quantitystore.domain.Item;
import com.damjan.quantitystore.repository.ItemRepository;
import org.springframework.stereotype.Component;

@Component
public class QuantityManager {
    private int quantity;


    // ????
    public QuantityManager(Item item) {
        this.quantity = item.getQuantity();
    }

    public int getQuantity() {
        return quantity;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public void decrementQuantity() {
        if (quantity > 0) {
            quantity--;
        }
    }
}
