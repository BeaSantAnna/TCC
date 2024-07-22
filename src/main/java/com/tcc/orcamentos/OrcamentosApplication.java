package com.tcc.orcamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.tcc.orcamentos.*")
public class OrcamentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrcamentosApplication.class, args);
	}

}
