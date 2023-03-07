package com.helloworld.Calculadora;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		//SpringApplication app = new SpringApplication(CalculadoraApplication.class);
		//app.setBannerMode(Banner.Mode.OFF);
		//app.run(args);

		SpringApplication.run(CalculadoraApplication.class, args);
	}

}
