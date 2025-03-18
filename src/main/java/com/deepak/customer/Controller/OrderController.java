package com.deepak.customer.Controller;

import com.deepak.customer.Model.Order;
import com.deepak.customer.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/getAllOrders")
    public List<Order> getAllOrders(){
        return orderService.getAllOrdersSvc();
    }

    @GetMapping("/getOrderDetailsById/{orderId}")
    public Order getOrderDetailsById(@PathVariable int orderId){
        return orderService.getOrderDetailsByIdSvc(orderId);
    }

    @PostMapping("/createNewOrder")
    public Order createNewOrder(@RequestBody Order order){
        return orderService.createNewOrderSvc(order);
    }

    @PutMapping("/updateOrderValue")
    public Order updateOrderValue(@RequestBody Order order){
        return orderService.updateOrderValueSvc(order);
    }

    @DeleteMapping("/deleteOrderById/{orderId}")
    public void deleteOrderById(@PathVariable int orderId){
        orderService.deleteOrderByIdSvc(orderId);
    }
}
