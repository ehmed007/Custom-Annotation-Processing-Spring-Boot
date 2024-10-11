package com.example.Custom.Annotation.Processors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class CustomProcessor {    

    private static final Logger logger = LoggerFactory.getLogger(CustomProcessor.class);


    @Around("@annotation(com.example.Custom.Annotation.Annotations.Check)")
    public Object processAnnotation() throws Throwable {

        System.out.println("Hyeeeeeeeeeee ma sadqy jaoun its running...........broooooooooooooooo");
        return new Object();
    }
}
