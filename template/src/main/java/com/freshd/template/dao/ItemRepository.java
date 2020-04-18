package com.freshd.template.dao;

import com.freshd.template.model.Item;
import org.jdbi.v3.core.Jdbi;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class ItemRepository {

    private ItemJDBIRepository taskJDBIRepository;

    public ItemRepository(Jdbi jdbi) {
        this.taskJDBIRepository = jdbi.onDemand(ItemJDBIRepository.class);
    }

    public Item insertItem(String description, BigDecimal price, Integer quantity) {
        return taskJDBIRepository.insertItem(description, price, quantity);
    }

    public Item findById(UUID ItemId) {
        return taskJDBIRepository.findById(ItemId);
    }
}

