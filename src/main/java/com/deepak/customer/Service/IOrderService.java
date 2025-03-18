package com.deepak.customer.Service;

import com.deepak.customer.Model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOrderService {
    public List<Order> getAllOrdersSvc();
    public Order getOrderDetailsByIdSvc(int orderId);
    public Order createNewOrderSvc(Order order);
    public Order updateOrderValueSvc(Order order);
    public void deleteOrderByIdSvc(int orderId);
}
