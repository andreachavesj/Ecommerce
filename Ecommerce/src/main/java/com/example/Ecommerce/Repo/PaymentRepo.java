package com.example.Ecommerce.Repo;

import com.example.Ecommerce.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
public interface PaymentRepo extends JpaRepository<Payment, Integer> {
    //Optional<Payment> findByIdcard(int idcard);

    List<Payment> findAllByIdcard(int idcard);
}
