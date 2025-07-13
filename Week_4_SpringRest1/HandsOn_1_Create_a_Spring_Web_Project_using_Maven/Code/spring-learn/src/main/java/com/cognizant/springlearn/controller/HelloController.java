package com.cognizant.springlearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "<html>" +
                "<head><title>Spring Web</title></head>" +
                "<body style='margin:0; padding:0; height:100vh; display:flex; align-items:center; justify-content:center; font-family:Arial;'>"
                +
                "<div style='text-align:center;'>" +
                "<h1 style='color:green;'>✅ Spring Web is Running!</h1>" +
                "<p style='font-size:18px;'>Hello Pranesh! Your application is up and working smoothly.</p>" +
                "</div>" +
                "</body></html>";
    }
}
