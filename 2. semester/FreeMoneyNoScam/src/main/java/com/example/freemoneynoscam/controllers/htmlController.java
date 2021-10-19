package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.repositories.scamDB;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class htmlController {
    private scamDB scDB = new scamDB();

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/test")
    public String userEmail(WebRequest wr){
        String parameter = wr.getParameter("test-input");
        System.out.println(parameter);
        scDB.updateMail(parameter);
        return "index";
    }
}
