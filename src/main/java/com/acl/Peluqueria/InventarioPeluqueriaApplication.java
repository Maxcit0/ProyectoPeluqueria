package com.acl.Peluqueria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class InventarioPeluqueriaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(InventarioPeluqueriaApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(InventarioPeluqueriaApplication.class);
	}
}
