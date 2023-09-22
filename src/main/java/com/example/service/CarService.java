package com.example.service;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Buyer;
import com.example.entity.Car;
import com.example.repo.CarRepo;

@Service
public class CarService {
 
@Autowired
CarRepo carrepo;



public List<Car> findAvailableCars(){

return carrepo.findBySoldFalse();
}

public Car findById(Integer Id)throws Exception{

    try {
    if(carrepo.findById(Id).isPresent()){
    Car car = carrepo.findById(Id).get();
    return car;
    }else{
    throw new Exception("Could not locate Vehicle");
    }
        
    } catch (Exception e) {
    throw new Exception("Could not locate Vehicle"); 
    }


}

public Car save(Car car) {
		
   return carrepo.save(car);

}

public String discount(Integer Id, LocalDate date){

return "";

}






}
