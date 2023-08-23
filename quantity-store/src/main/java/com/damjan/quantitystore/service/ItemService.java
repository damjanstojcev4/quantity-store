package com.damjan.quantitystore.service;

import com.damjan.quantitystore.domain.Item;
import com.damjan.quantitystore.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item getItemBySku(Integer sku) {
        return itemRepository.findBySku(sku);
    }

    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    public void updateItemQuantity(Integer sku, int quantity) {
        Item item = itemRepository.findBySku(sku);
        if (item != null) {
            int oldQuantity = item.getQuantity();
            item.setQuantity(quantity);
            itemRepository.updateQuantityBySku(sku, quantity);
        }
    }
}
