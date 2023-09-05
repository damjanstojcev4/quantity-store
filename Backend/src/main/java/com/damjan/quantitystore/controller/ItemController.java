package com.damjan.quantitystore.controller;

import com.damjan.quantitystore.domain.Item;
import com.damjan.quantitystore.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/linkesti")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/{sku}")
    public Item getItemBySku(@PathVariable Integer sku) {
        return itemService.getItemBySku(sku);
    }

    @PostMapping("/add")
    public Item addArticle(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateItemQuantity(@RequestParam Integer sku, @RequestParam Integer quantity) {
        itemService.updateItemQuantity(sku, quantity);
        return ResponseEntity.ok("Item quantity updated successfully");
    }

    @DeleteMapping("/delete/{sku}")
    public ResponseEntity<Void> deleteItemBySku(@PathVariable Integer sku) {
        itemService.deleteBySku(sku);
        return ResponseEntity.noContent().build();
    }

}
