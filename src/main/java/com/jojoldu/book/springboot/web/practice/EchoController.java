package com.jojoldu.book.springboot.web.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EchoController {
    // TODO: GET /echo/{message} 매핑
    @GetMapping("/echo/{message}")
    public String echo(@PathVariable("message") String message) {
        return new StringBuilder(message).reverse().toString();
    }
}