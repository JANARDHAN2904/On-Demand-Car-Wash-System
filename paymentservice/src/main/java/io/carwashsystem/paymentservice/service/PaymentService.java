package io.carwashsystem.paymentservice.service;


import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.carwashsystem.paymentservice.model.PaymentDetails;
import io.carwashsystem.paymentservice.repo.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public PaymentDetails doPay(PaymentDetails payment){
        payment.setPaymentStatus(paymentStatus());
        payment.setTxId(UUID.randomUUID().toString());
        return repository.save(payment);
    }

    private String paymentStatus(){
    	
        return new Random().nextBoolean()?"success":"failure";
    }
}