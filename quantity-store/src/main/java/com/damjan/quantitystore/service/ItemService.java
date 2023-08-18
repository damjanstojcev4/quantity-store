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

    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    public Item getItemBySku(Long sku) {
        return itemRepository.findBySku(sku);
    }

    public void updateItemQuantity(Integer itemId, int newQuantity) {
        Item item = itemRepository.findById(itemId).orElse(null);
        if (item != null) {
            int oldQuantity = item.getQuantity();
            item.setQuantity(newQuantity);
            itemRepository.updateQuantity(newQuantity);

            // Update History's currentQuantity
//            History history = new History();
//            history.setCurrentQuantity(newQuantity);
//            historyRepository.updateQuantity(newQuantity);
        }
    }
}
