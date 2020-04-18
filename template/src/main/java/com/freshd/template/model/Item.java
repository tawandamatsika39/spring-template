package com.freshd.template.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class Item {

    @JsonProperty("itemId")
    private final UUID itemId;
    @JsonProperty("description")
    private final String description;
    @JsonProperty("price")
    private final BigDecimal price;
    @JsonProperty("quantity")
    private final Integer quantity;

    public Item(UUID itemId, String description, BigDecimal price, Integer quantity) {
        this.itemId = itemId;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }


}
