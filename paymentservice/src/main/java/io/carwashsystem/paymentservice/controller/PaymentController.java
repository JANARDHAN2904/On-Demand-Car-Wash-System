package io.carwashsystem.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.carwashsystem.paymentservice.model.PaymentDetails;
import io.carwashsystem.paymentservice.service.PaymentService;

@RestController
public class PaymentController {
    @Autowired
    public PaymentService service;

    @PostMapping("/payment/")
    public PaymentDetails doPayment(@RequestBody PaymentDetails payment){
        return service.doPay(payment);
    }
}
