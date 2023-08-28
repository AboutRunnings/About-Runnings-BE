package com.aboutrunnings.api.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health")
public class HealthCheckController {

    @GetMapping("/check")
    public String healthCheck() {
        return "OK";
    }
}
