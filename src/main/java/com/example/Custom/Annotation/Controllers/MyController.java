package com.example.Custom.Annotation.Controllers;


import com.example.Custom.Annotation.Services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/")
    public String say() throws InterruptedException {
        this.myService.serve();
        return "Hello World";
    }

}
