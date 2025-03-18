package com.deepak.customer.Service;

import com.deepak.customer.Model.Order;
import com.deepak.customer.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService{
    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrdersSvc() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderDetailsByIdSvc(int orderId) {
        return orderRepository.findById(orderId).get();
    }

    @Override
    public Order createNewOrderSvc(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrderValueSvc(Order order) {
        Order updatedOrder = getOrderDetailsByIdSvc(order.getId());
        updatedOrder.setOrderValue(order.getOrderValue());
        orderRepository.save(updatedOrder);
        return updatedOrder;
    }

    @Override
    public void deleteOrderByIdSvc(int orderId) {
        orderRepository.deleteById(orderId);
    }
}
