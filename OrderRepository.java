package com.elonsy.trading.repository;

import com.elonsy.trading.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
