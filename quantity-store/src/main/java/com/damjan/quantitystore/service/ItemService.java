package com.damjan.quantitystore.service;

import com.damjan.quantitystore.domain.Item;
import com.damjan.quantitystore.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item getItemById(Integer id) {
        return itemRepository.findById(id).orElse(null);
    }

    public void deleteItem(Integer id) { // ne delete
        itemRepository.deleteById(id);
    }

    public void updateItemQuantity(Integer id, int newQuantity) {
        Item item = itemRepository.findById(id).orElse(null);
        if (item != null) {
            item.setQuantity(newQuantity);
            itemRepository.save(item);
        }
    }
}
