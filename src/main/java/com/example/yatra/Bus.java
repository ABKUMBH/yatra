package com.example.yatra;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Bus {
    @GetMapping("/mybus")
    public String getData(){
        return "No Bus Available bro";
    }
}
