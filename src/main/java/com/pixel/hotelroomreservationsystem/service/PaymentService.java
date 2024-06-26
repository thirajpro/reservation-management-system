package com.pixel.hotelroomreservationsystem.service;

import com.pixel.hotelroomreservationsystem.entity.Payment;
import com.pixel.hotelroomreservationsystem.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//Payment Service class for handling payments
@Service
public class PaymentService {

    //Injecting Payment Repository dependency
    @Autowired
    private PaymentRepository paymentRepository;

    //Creating new Payment
    public Payment createPayment(Payment payment){
        return paymentRepository.save(payment);
    }
}
