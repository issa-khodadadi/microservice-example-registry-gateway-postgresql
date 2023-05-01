package com.mytutorials.orderservice.controller;

import com.mytutorials.orderservice.common.Payment;
import com.mytutorials.orderservice.common.TransactionRequest;
import com.mytutorials.orderservice.common.TransactionResponse;
import com.mytutorials.orderservice.model.Order;
import com.mytutorials.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created on 4/30/2023 15:43:37,
 */
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/bookorder")
    @ResponseStatus(HttpStatus.CREATED)
    public TransactionResponse placeOrder(@RequestBody TransactionRequest request) {

        return orderService.placeOrder(request);

    }
}
