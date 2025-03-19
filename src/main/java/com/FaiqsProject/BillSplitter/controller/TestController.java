package com.FaiqsProject.BillSplitter.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getCurrentUserDetails(Authentication authentication) {

        return authentication.getName();
    }

    @GetMapping("/meow")
    public String getCurrentUserDetails() {

        return "String";
    }
}
