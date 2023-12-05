package com.example.Ecommerce.Service.Impl;

import com.example.Ecommerce.Dto.LoginDTO;
import com.example.Ecommerce.Dto.PaymentDTO;
import com.example.Ecommerce.Entity.Payment;
import com.example.Ecommerce.Entity.User;
import com.example.Ecommerce.Repo.PaymentRepo;
import com.example.Ecommerce.Service.PaymentService;
import com.example.Ecommerce.response.LoginResponse;
import com.example.Ecommerce.response.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentIMPL implements PaymentService {
    @Autowired
    private PaymentRepo paymentRepo;

    @Override
    public int addPayment(PaymentDTO paymentDTO){
        Payment payment = new Payment(
                paymentDTO.getPaymentid(),
                paymentDTO.getIdcard(),
                paymentDTO.getCardnumber(),
                paymentDTO.getName(),
                paymentDTO.getExpired(),
                paymentDTO.getCvc()
        );

        paymentRepo.save(payment);

        return payment.getCardnumber();
    }
    @Override
    public List<Payment> getAllPaymentsByUserIdcard(int idcard) {
        return paymentRepo.findAllByIdcard(idcard);
    }

}
