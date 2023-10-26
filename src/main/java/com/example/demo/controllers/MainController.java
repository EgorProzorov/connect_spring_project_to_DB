package com.example.demo.controllers;

import com.example.demo.models.ClientInfo;
import com.example.demo.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/")
    public String home(Model model){
        return "main";
    }


    @GetMapping("/login")
    public String registration(Model model){
        return "login";
    }

    @PostMapping("/login")
    public String getUserInfo(@RequestParam String First_Name, @RequestParam String Second_Name, @RequestParam String Email, @RequestParam String Pass, Model model){
        ClientInfo client = new ClientInfo(First_Name, Second_Name, Email, Pass);
        clientRepository.save(client);
        return "redirect:/main";
    }
}
