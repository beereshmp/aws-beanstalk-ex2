package com.beeresh.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloConroller {



    @GetMapping
    public String hello()
    {
        return "Hello AWS";
    }
}
