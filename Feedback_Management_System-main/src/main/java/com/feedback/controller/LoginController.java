package com.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.feedback.repository.AdminRepository;
import com.feedback.model.Admin;

import java.util.Map;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    AdminRepository repo;

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> data) {

        String user = data.get("username");
        String pass = data.get("password");

        Admin admin = repo.findByUsernameAndPassword(user, pass);

        if(admin != null){
            return "success";
        }

        return "fail";
    }
}