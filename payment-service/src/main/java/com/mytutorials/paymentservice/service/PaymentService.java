package com.mytutorials.paymentservice.service;

import com.mytutorials.paymentservice.model.Payment;
import com.mytutorials.paymentservice.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;
import java.util.UUID;

/**
 * Created on 4/30/2023 17:51:10,
 */
@Service
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;


    @Transactional
    public Payment doPayment(Payment payment) {
        payment.setTransactionId(UUID.randomUUID().toString());
        payment.setPaymentStatus(paymentProcess());
        return paymentRepository.save(payment);
    }

    public String paymentProcess() {
        return new Random().nextBoolean() ? "success" : "false";
    }
}
