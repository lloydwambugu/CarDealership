package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.Buyer;
import com.example.entity.Car;
import com.example.repo.CarRepo;
import com.example.service.AuthenticationService;
import com.example.service.CarService;

import jakarta.servlet.http.HttpSession;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class CarController {

    @Autowired
    CarService carservice;

    @Autowired
    AuthenticationService authenticationService;

    @Autowired
    CarRepo carrepo;

    @GetMapping("/cars")
    public String carInvetoryList(Model model) {

        List<Car> carList = carservice.findAvailableCars();

        model.addAttribute("cars", carList);

        return "cars";
    }

    @GetMapping("/carview/{CarId}")
    public String addCar(Model model, @PathVariable("CarId") Integer Id, HttpSession session) {

        try {
            if (session.getAttribute("user") == null) {
                return "redirect:signin";
            }
            Buyer buyer = (Buyer) session.getAttribute("user");
            Car car = carservice.findById(Id);

            model.addAttribute("car", car);
            model.addAttribute("buyer", buyer);
            return "carview";
        } catch (Exception e) {
            return "carview";
        }

    }

    @GetMapping("/search")
    public String searchCar(Model model, String make) {

        List<Car> cars = carrepo.findBySoldFalseAndMake(make);

        model.addAttribute("cars", cars);
        return "cars";
    }
}
