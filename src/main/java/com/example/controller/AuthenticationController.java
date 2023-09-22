package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Buyer;
import com.example.entity.Seller;
import com.example.service.AuthenticationService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AuthenticationController {

    @Autowired
    AuthenticationService authenticationService;

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/signup")
    public String signUp(Model model) {

        model.addAttribute("buyer", new Buyer());

        return "signup";
    }

    @PostMapping("/signup")
    public ModelAndView signUp(@ModelAttribute Buyer buyer, Model model) {

        try {
            authenticationService.save(buyer);
            return new ModelAndView("redirect:/", "buyer", buyer);

        } catch (Exception e) {

            return new ModelAndView("signup", "msg", "could not work please retry");

        }
    }

    @GetMapping("/signin")
    public String signIn() {

        return "signin";
    }

    @PostMapping("/signin")
    public String signIn(@RequestParam("email") String email,
            @RequestParam("password") String password,
            HttpSession session) throws Exception {
        try {
            Object user = authenticationService.signIn(email, password);
            session.setAttribute("user", user);
            session.setAttribute("userType", user.getClass().getSimpleName());
            return "redirect: ";
        } catch (RuntimeException e) {
            return "signin";
        }
    }


    
    @GetMapping("/logOut")
    public String logOut(Model model, HttpSession session){
    session.invalidate();

    return "redirect:/signin";
    }

}
