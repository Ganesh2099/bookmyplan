package com.example.bookmyplan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class railways {

    @GetMapping("/railways")
    public String getData() {
        return "Hello Welcome to BookMyPlan, Please book railways tickets25 at 20% discount";
    }
}