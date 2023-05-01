package com.mytutorials.orderservice.service;

import com.mytutorials.orderservice.common.Payment;
import com.mytutorials.orderservice.common.TransactionRequest;
import com.mytutorials.orderservice.common.TransactionResponse;
import com.mytutorials.orderservice.model.Order;
import com.mytutorials.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Created on 4/30/2023 15:47:43,
 */
@Service
//@RequiredArgsConstructor
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Transactional
    public TransactionResponse placeOrder(TransactionRequest request) {
        String response = "";

        Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());

        // rest call
        Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE/payment/dopayment", payment,
                Payment.class);

        response = paymentResponse.getPaymentStatus().equals("success") ? "payment was successfull" : "there is a " +
                "failiur in payment";

        orderRepository.save(order);

        return new TransactionResponse(order, paymentResponse.getAmount(), paymentResponse.getTransactionId(), response);
    }
}
