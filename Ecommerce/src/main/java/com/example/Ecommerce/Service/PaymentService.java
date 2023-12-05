package com.example.Ecommerce.Service;

import com.example.Ecommerce.Dto.PaymentDTO;
import com.example.Ecommerce.Entity.Payment;

import java.util.List;

public interface PaymentService {
    int addPayment(PaymentDTO paymentDTO);
    List<Payment> getAllPaymentsByUserIdcard(int idcard);
}
