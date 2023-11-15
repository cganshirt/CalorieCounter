package com.example.demo.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping(value = "/getItems")
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @RequestMapping(value = "/getItemsByName/{name}")
    public List<Item> getItemsByName(@PathVariable String name) {
        return itemService.getItemsByName(name);
    }
}
