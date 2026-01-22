package com.example.bookmyplan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight {

    @GetMapping("/flight")
    public String getData() {
        return "Hello Welcome to BookMyPlan, Please book Flight tickets at 10% discount";
    }
}