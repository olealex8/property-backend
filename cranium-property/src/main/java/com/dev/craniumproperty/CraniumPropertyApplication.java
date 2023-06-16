package com.dev.craniumproperty;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dev.craniumproperty.repository")
public class CraniumPropertyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CraniumPropertyApplication.class, args);
	}

}
