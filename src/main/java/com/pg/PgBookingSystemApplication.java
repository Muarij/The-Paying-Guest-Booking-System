package com.pg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.pg.*")
public class PgBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PgBookingSystemApplication.class, args);
	}

}
