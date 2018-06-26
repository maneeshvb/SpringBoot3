package com.example.project;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Configuration
@ComponentScan("com.example.project.*")
//@ComponentScan(basePackageClasses=com.example.project.Hospital.class)
public interface HospitalRepository //extends JpaRepository <Hospital,Integer>

	{

}