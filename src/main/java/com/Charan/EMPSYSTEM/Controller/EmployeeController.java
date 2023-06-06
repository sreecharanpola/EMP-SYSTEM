package com.Charan.EMPSYSTEM.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmployeeController {

    @GetMapping("Hello")
    public String hello(){
        return "Helloksajmdklsnadksandlkisadsan";
    }
}
