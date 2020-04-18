//package com.freshd.template.service;
//
//import com.freshd.template.dao.OrderDao;
//import com.freshd.template.model.Order;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.UUID;
//@Service
//public class OrderService {
//
//    private final OrderDao dao;
//
//    @Autowired
//    public OrderService(OrderDao dao) {
//        this.dao = dao;
//    }
//
//    public Order getOrder(UUID id){
//        return dao.getOrderWithId(id).orElse(null);
//    }
//
//    public boolean addOrder(Order order){
//        return dao.insert(order);
//    }
//
//    public List<Order> getAllOrders(){
//        return dao.getAllOrders();
//    }
//}
