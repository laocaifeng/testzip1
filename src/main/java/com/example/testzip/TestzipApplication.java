package com.example.testzip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestzipApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestzipApplication.class, args);
    }


    @RequestMapping("/index")
    public String index(){
        return "hello";
    }
}
