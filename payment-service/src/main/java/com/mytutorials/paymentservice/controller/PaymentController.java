package com.mytutorials.paymentservice.controller;

import com.mytutorials.paymentservice.model.Payment;
import com.mytutorials.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * Created on 4/30/2023 17:52:42,
 */
@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {

    public final PaymentService paymentService;

    @PostMapping("/dopayment")
    @ResponseStatus(HttpStatus.CREATED)
    public Payment placeOrder(@RequestBody Payment payment) {
        return paymentService.doPayment(payment);
    }
}
