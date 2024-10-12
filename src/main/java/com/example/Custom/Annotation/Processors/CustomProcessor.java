package com.example.Custom.Annotation.Processors;

import com.example.Custom.Annotation.Annotations.Check;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;


@Aspect
@Component
public class CustomProcessor {

    private static final Logger logger = LoggerFactory.getLogger(CustomProcessor.class);


//    @Before("@annotation(com.example.Custom.Annotation.Annotations.Check)")
//    @Before("execution(com.example.Custom.Annotation.Services.MyService.serve(..))")
    @Around("@annotation(com.example.Custom.Annotation.Annotations.Check)")
    public Object processAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {

        Class<?> myClass = joinPoint.getTarget().getClass();
        Method[] methods = myClass.getMethods();

        for (Method method: methods) {
            if (method.isAnnotationPresent(com.example.Custom.Annotation.Annotations.Check.class)) {
                Check check = method.getAnnotation(Check.class);
                System.out.println(check.value());
            }
        }


        System.out.println("custom processor is running............................");

        return joinPoint.proceed();
    }
}
