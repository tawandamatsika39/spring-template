//package com.freshd.template.dao;
//
//import com.freshd.template.exceptions.OrderNotFoundException;
//import com.freshd.template.model.Order;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//public class OrderDataAccessService implements OrderDao {
//
//    List<Order> mockOrders = new ArrayList<Order>();
//
//    @Override
//    public boolean insertWithId(UUID id, Order order) {
//        Order newOrder = new Order(id, order.getDescription(),
//                                    order.getStatus(), order.getOrderItems());
//        mockOrders.add(newOrder);
//        return true;
//    }
//
//    @Override
//    public Optional<Order> getOrderWithId(UUID id) {
//        return mockOrders.stream()
//                .filter(order -> order.getOrderId().equals(id))
//                .findFirst();
//    }
//
//    @Override
//    public List<Order> getAllOrders() {
//        return mockOrders;
//    }
//}
