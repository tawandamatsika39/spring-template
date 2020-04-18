//package com.freshd.template.dao;
//
//import com.freshd.template.model.Order;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//public interface OrderDao {
//
//    boolean insertWithId(UUID id, Order order);
//
//    default boolean insert(Order order){
//        UUID id = UUID.randomUUID();
//        return insertWithId(id, order);
//    }
//
//    Optional<Order> getOrderWithId(UUID id);
//
//    List<Order> getAllOrders();
//}
