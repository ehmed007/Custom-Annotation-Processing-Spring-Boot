package com.example.Custom.Annotation.Services;

import com.example.Custom.Annotation.Annotations.Check;
import org.springframework.stereotype.Service;


@Service
public class MyService {

    @Check(value = "hello this is my value")
    public void serve() throws InterruptedException {
        System.out.println("Service executed");
    }
}
