package com.example.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Seller;

import jakarta.persistence.Id;


public interface SellerRepo extends JpaRepository<Seller,Integer> {

@Query(value = "SELECT * FROM SELLER WHERE email = ?1 AND password =?2" , nativeQuery = true)
public Seller signIn(String email, String password);

public Optional<Seller> findByEmail(String email);

public Optional<Seller> findById(int Id);
}
