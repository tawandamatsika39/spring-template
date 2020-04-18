//package com.freshd.template.model;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.freshd.template.enums.OrderStatus;
//import lombok.Data;
//
//import java.util.List;
//import java.util.UUID;
//
//@Data
//public class Order {
//
//    @JsonProperty("orderId")
//    private final UUID orderId;
//    @JsonProperty("description")
//    private final String description;
//    @JsonProperty("status")
//    private final OrderStatus status;
//    @JsonProperty("orderItems")
//    private final List<Item> orderItems;
//
//    public Order(UUID orderId, String description, OrderStatus status, List<Item> orderItems) {
//        this.orderId = orderId;
//        this.description = description;
//        this.status = status;
//        this.orderItems = orderItems;
//    }
//
//    public UUID getOrderId() {
//        return orderId;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public OrderStatus getStatus() {
//        return status;
//    }
//
//    public List<Item> getOrderItems() {
//        return orderItems;
//    }
//}
