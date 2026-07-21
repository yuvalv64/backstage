package com.example.bankservice.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/accounts")
@Tag(name = "Bank Service API", description = "Basic endpoints for Bank Microservice")
public class HelloController {

    @GetMapping("/{id}")
    public Map<String, String> getAccount(@PathVariable String id) {
        return Map.of(
                "accountId", id,
                "status", "ACTIVE",
                "owner", "Yuval");
    }
}
