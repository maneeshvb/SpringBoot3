package com.example.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("com.example.project.*")
@ComponentScan(basePackageClasses=com.example.project.HospitalController.class)
@EntityScan("com.example.project.*")

public class SpringBoot3Application {
	
	
		public static void main(String[] args) {
		SpringApplication.run(SpringBoot3Application.class, args);
	}
}

