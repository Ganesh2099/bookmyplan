package com.example.bookmyplan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holiday {

    @GetMapping("/holiday")
    public String getData() {
        return "Hello Welcome to BookMyPlan, Please book holiday tickets at 10% discount";
    }
}