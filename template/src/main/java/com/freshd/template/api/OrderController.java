//package com.freshd.template.api;
//
//import com.freshd.template.model.Order;
//import com.freshd.template.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.UUID;
//
//@RequestMapping("v1/api/order")
//@RestController
//public class OrderController {
//
//    private final OrderService orderService;
//
//    @Autowired
//    public OrderController(OrderService orderService) {
//        this.orderService = orderService;
//    }
//
//    @GetMapping(path ="{orderId}")
//    public Order getOrder(@PathVariable("orderId") UUID orderId){
//        return orderService.getOrder(orderId);
//    }
//
//    @GetMapping
//    public List<Order> getOrder(){
//        return orderService.getAllOrders();
//    }
//
//    @PostMapping
//    public boolean addOrder(@RequestBody Order order){
//        return orderService.addOrder(order);
//    }
//}
