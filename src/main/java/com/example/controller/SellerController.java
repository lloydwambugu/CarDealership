package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.Buyer;
import com.example.entity.Car;
import com.example.entity.Seller;
import com.example.service.AuthenticationService;
import com.example.service.CarService;

import jakarta.servlet.http.HttpSession;

@Controller
public class SellerController {
    
@Autowired
AuthenticationService authenticationService;

@Autowired
CarService carservice;




@GetMapping("/addcar")
public String addCar(Model model,@PathVariable("SellerId") Integer Id, HttpSession session){
try{
    if(session.getAttribute("user") == null){
        return "redirect:signin";
    }
    Seller seller = (Seller) session.getAttribute("user");
    Car car = carservice.findById(Id);

    model.addAttribute("car", car);
    model.addAttribute("seller", seller);
    return "addcar";
}catch (Exception e) {
    return "addcar";
}

}


}
