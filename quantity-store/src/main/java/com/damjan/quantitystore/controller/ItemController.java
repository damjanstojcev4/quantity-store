package com.damjan.quantitystore.controller;

import com.damjan.quantitystore.domain.Item;
import com.damjan.quantitystore.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    public Item getItemBySku(@PathVariable Long sku) {
        return itemService.getItemBySku(sku);
    }

    @PostMapping("/add")
    public Item addArticle(@RequestBody Item item) {
        return itemService.addItem(item);
    }

}
