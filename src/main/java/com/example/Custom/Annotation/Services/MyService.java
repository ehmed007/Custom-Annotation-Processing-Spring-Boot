package com.example.Custom.Annotation.Services;

import com.example.Custom.Annotation.Annotations.Check;
import org.springframework.stereotype.Service;


@Service
public class MyService {

    @Check
    public void serve() throws InterruptedException {
        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
        System.out.println("Service executed");
    }
}
