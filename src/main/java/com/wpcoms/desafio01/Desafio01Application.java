package com.wpcoms.desafio01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wpcoms.desafio01.entities.Order;
import com.wpcoms.desafio01.services.OrderService;
import com.wpcoms.desafio01.services.ShippingService;
/*import com.wpcoms.desafio01.services.ShippingService; */

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {
	
	/*private Order order; */
	private OrderService orderService;
	private ShippingService shippingService;
	
	/*
	public Desafio01Application(Order order,OrderService orderService, ShippingService shippingService) {
		this.order = order;
		this.orderService = orderService;
		this.shippingService = shippingService;
	} */
	
	public Desafio01Application(OrderService orderService, ShippingService shippingService) {
		this.orderService = orderService;
		this.shippingService = shippingService;
	}

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
		System.out.println(orderService.total(order));
		/*System.out.println(shippingService.shipment(order));*/

		
		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.println(order2);
		System.out.println(order2.getCode());
		System.out.println(order2.getBasic());
		System.out.println(order2.getDiscount());
		System.out.println(orderService.total(order2));
		/*System.out.println(shippingService.shipment(order2));*/


		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println(order3);
		System.out.println(order3.getCode());
		System.out.println(order3.getBasic());
		System.out.println(order3.getDiscount());
		System.out.println(orderService.total(order3));
		/*System.out.println(shippingService.shipment(order3));*/

		
		
	}

}
