package com.mytutorials.orderservice.repository;

import com.mytutorials.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 4/30/2023 15:53:02,
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
