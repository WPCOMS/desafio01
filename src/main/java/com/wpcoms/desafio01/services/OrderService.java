package com.wpcoms.desafio01.services;

import org.springframework.stereotype.Service;

import com.wpcoms.desafio01.entities.Order;

@Service
public class OrderService {
	
	private ShippingService shippingService;
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
	public double total(Order order) {
		System.out.println(order.getCode());
		/*System.out.println(order.getBasic());
		System.out.println(order.getDiscount());*/

		return order.getBasic() - (order.getDiscount() * order.getBasic())/100 + shippingService.shipment(order);
	}
}
