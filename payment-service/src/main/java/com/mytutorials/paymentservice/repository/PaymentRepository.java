package com.mytutorials.paymentservice.repository;

import com.mytutorials.paymentservice.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 4/30/2023 17:50:28,
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
