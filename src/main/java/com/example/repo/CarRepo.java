package com.example.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Car;
import jakarta.persistence.Id;

public interface CarRepo extends JpaRepository<Car, Integer> {
    
  List<Car> findBySoldFalse(); 
   List<Car> findBySoldFalseAndMake(String make); 

}
