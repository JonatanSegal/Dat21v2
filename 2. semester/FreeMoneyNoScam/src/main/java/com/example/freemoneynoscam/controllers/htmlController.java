package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.services.freeMoneyServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class htmlController {
    //private static

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/test")
    public String userEmail(WebRequest wr){
        freeMoneyServices fms = new freeMoneyServices();
        String name = wr.getParameter("user-name");
        String email =wr.getParameter("user-mail");
        fms.addMail(name,email);
        System.out.println(name);
        System.out.println(email);
        return "index";
    }

    @GetMapping("/users")
    public String userList(Model model){
        freeMoneyServices fms = new freeMoneyServices();
        model.addAttribute("users",fms.getAllUsers());
        return "users";
    }
}
