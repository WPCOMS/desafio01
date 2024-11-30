package com.wpcoms.desafio01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wpcoms.desafio01.entities.Order;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	private Order order;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1034, 150.0, 20.0);
		System.out.println(order);
		System.out.println(order.getCode());
		System.out.println(order.getBasic());
		System.out.println(order.getDiscount());
		
		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.println(order2);
		System.out.println(order2.getCode());
		System.out.println(order2.getBasic());
		System.out.println(order2.getDiscount());

		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println(order3);
		System.out.println(order3.getCode());
		System.out.println(order3.getBasic());
		System.out.println(order3.getDiscount());
		
		
	}

}
