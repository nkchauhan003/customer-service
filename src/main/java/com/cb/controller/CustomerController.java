package com.cb.controller;

import com.cb.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class CustomerController {

    @GetMapping("/customers")
    public Customer getCustomer(@RequestParam String customerId) throws InterruptedException {
        // 500 ms delay to simulate latency
        TimeUnit.MILLISECONDS.sleep(500);
        return Customer.builder()
                .customerId(customerId)
                .name("John Doe")
                .email("john.doe@example.com")
                .phone("123-456-7890")
                .build();
    }
}
