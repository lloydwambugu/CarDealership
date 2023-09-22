package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Buyer;
import jakarta.persistence.Id;
import java.util.List;
import java.util.Optional;


public interface BuyerRepo extends JpaRepository <Buyer,Integer> {

@Query(value = "SELECT * FROM BUYER WHERE email = ?1 AND password =?2", nativeQuery = true)
public Buyer signIn(String email, String password);


public Optional<Buyer> findByEmail(String email);
 
public Optional<Buyer> findById(Integer Id);

}
