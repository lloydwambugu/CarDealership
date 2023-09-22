package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Transaction;

import jakarta.persistence.Id;

public interface TransactionsRepo extends JpaRepository<Transaction, Id> {
    
}
