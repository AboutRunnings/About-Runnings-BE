package com.aboutrunnings.api.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping(value = "/health")
public class HealthCheckController {

    @GetMapping("/check")
    public String healthCheck() {
        return "OK";
    }
}
