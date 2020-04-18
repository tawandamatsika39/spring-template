package com.freshd.template.api;

import com.freshd.template.dao.ItemRepository;
import com.freshd.template.dto.ItemDTO;
import com.freshd.template.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/items")
public class ItemController {

    private ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository= itemRepository;
    }

    @PostMapping
    public ItemDTO addItem(@RequestBody Item request) {
        Item item = itemRepository.insertItem(request.getDescription(), request.getPrice(), request.getQuantity());
        return new ItemDTO(item.getItemId(), item.getDescription(), item.getPrice(), item.getQuantity());
    }

    @GetMapping("/{itemId}")
    public ItemDTO getItem(@PathVariable("itemId") UUID itemId) {
        Item item = itemRepository.findById(itemId);
        return new ItemDTO(item.getItemId(), item.getDescription(), item.getPrice(), item.getQuantity());
    }

}