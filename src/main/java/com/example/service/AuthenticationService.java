package com.example.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Buyer;
import com.example.entity.Seller;
import com.example.repo.BuyerRepo;
import com.example.repo.SellerRepo;

import jakarta.servlet.http.HttpSession;

@Service
public class AuthenticationService {

@Autowired
SellerRepo sellerrepo;

@Autowired
BuyerRepo buyerrepo;



public Buyer save(Buyer buyer) {
		
   return buyerrepo.save(buyer);

}

public Object signIn(String email, String password) throws Exception{

    Optional<Buyer> loginBuyer = buyerrepo.findByEmail(email);
    if(loginBuyer.isPresent() && loginBuyer.get().getPassword().equals(password)){
    return loginBuyer.get();
    }
    Optional<Seller> loginSeller = sellerrepo.findByEmail(email);
      if(loginSeller.isPresent() && loginSeller.get().getPassword().equals(password)){
    return loginSeller.get();
}
throw new RuntimeException("Incorrect login");
}



}




