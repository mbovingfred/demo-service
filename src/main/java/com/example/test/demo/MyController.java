package com.example.test.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin("*")
public class MyController{
    @GetMapping("/students")
    public Student endpoint(){
        return new Student(1,"Fredy");
    }
}