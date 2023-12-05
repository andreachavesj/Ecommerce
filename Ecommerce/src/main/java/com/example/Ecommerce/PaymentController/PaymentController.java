package com.example.Ecommerce.PaymentController;

import com.example.Ecommerce.Dto.PaymentDTO;
import com.example.Ecommerce.Entity.Payment;
import com.example.Ecommerce.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(path = "/save")
    public String savePayment(@RequestBody PaymentDTO paymentDTO){
        String id = String.valueOf(paymentService.addPayment(paymentDTO));
        return id;
    }

    @GetMapping(path = "/getByUserIdcard/{idcard}")
    public ResponseEntity<List<Payment>> getAllPaymentsByUserIdcard(@PathVariable int idcard) {
        List<Payment> payments = paymentService.getAllPaymentsByUserIdcard(idcard);
        return new ResponseEntity<>(payments, HttpStatus.OK);
    }
}
