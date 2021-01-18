package com.example.simpleMybatisPlus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.simpleMybatisPlus")
public class SimpleMybatisPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleMybatisPlusApplication.class, args);
	}

}
