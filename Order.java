package com.elonsy.trading.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String email;
    private String phone;

    @ElementCollection
    @CollectionTable(name = "order_items", joinColumns = @JoinColumn(name = "order_id"))
    @Column(name = "item")
    private List<String> items;

    private Double totalAmount;

    private LocalDateTime createdAt;

    // Constructors
    public Order() {}

    public Order(String customerName, String email, String phone, List<String> items, Double totalAmount) {
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
        this.items = items;
        this.totalAmount = totalAmount;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and setters omitted for brevity
    // (You can auto-generate them in your IDE)
}
