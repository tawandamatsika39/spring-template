package com.freshd.template.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.UUID;

public class ItemDTO {
    @JsonProperty("itemId")
    private final UUID itemId;
    @JsonProperty("description")
    private final String description;
    @JsonProperty("price")
    private final BigDecimal price;
    @JsonProperty("quantity")
    private final Integer quantity;

    public ItemDTO(UUID itemId, String description, BigDecimal price, Integer quantity) {
        this.itemId = itemId;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }


}
