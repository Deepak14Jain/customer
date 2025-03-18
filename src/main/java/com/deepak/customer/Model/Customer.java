package com.deepak.customer.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String customerName;
    String addr;
    String phone;
    String email;

    @Transient
    private Double totalPurchaseValue;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders;

    @PostLoad
    @PostPersist
    @PostUpdate
    public void calculateTotalPurchaseValue() {
        this.totalPurchaseValue = (orders != null) ?
                orders.stream().mapToDouble(Order::getOrderValue).sum() : 0.0;
    }

}
