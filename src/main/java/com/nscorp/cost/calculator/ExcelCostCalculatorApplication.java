package com.nscorp.cost.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan(basePackages = {"com.nscorp.cost.calculator.db"} )
//@EnableJpaRepositories(basePackages = {"com.nscorp.cost.calculator.db"})
public class ExcelCostCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcelCostCalculatorApplication.class, args);
	}
}
