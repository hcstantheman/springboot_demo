package com.example.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class RegisterController {

    @GetMapping("/signUp")
    public String doGet() {
        return "signUp.html";
    }

    @GetMapping("/register")
    public String doGet(@RequestParam("name") String name, @RequestParam("birth") LocalDate birth, Model model) {

        model.addAttribute("name", name);
        model.addAttribute("birth", birth);

        return "register.html";
    }
}
