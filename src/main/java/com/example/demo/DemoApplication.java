package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("\n\n\nHola mundo!!");
		// en cuanto a la bd: usuario(correcto), libro(correcto), prestamo(correcto)
	}
}
