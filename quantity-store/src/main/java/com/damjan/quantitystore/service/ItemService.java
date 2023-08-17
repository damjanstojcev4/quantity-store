package com.damjan.quantitystore.service;

import com.damjan.quantitystore.domain.History;
import com.damjan.quantitystore.domain.Item;
import com.damjan.quantitystore.repository.HistoryRepository;
import com.damjan.quantitystore.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;
    private final HistoryRepository historyRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository, HistoryRepository historyRepository) {
        this.itemRepository = itemRepository;
        this.historyRepository = historyRepository;
    }

    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

//    public Item getItemById(Integer id) {
//        return itemRepository.findById(id).orElse(null);
//    }
//
//    public void updateItemQuantity(Integer itemId, int newQuantity) {
//        Item item = itemRepository.findById(itemId).orElse(null);
//        if (item != null) {
//            int oldQuantity = item.getQuantity();
//            item.setQuantity(newQuantity);
//            itemRepository.updateQuantity(newQuantity);
//
//            // Update History's currentQuantity
//            History history = new History();
//            history.setCurrentQuantity(newQuantity);
//            historyRepository.updateQuantity(newQuantity);
//        }
//    }
    public List<Item> getItemBySku(Long sku) {
        return itemRepository.findBySku(sku);
    }
}
