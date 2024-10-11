package com.example.Custom.Annotation;

import com.example.Custom.Annotation.Services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CustomAnnotationApplication implements CommandLineRunner {

	@Autowired
	private MyService myService;

	public static void main(String[] args) {
		SpringApplication.run(CustomAnnotationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("running..........");
		myService.serve();
		System.out.println("completed.......");
	}
}
