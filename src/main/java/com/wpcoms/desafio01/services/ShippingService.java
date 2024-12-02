package com.wpcoms.desafio01.services;

import org.springframework.stereotype.Service;

import com.wpcoms.desafio01.entities.Order;

@Service
public class ShippingService {
	
	public ShippingService() {
	}
	public double shipment(Order order) {
		double basic = order.getBasic();
		double frete = 0.0;
		if (basic < 100.0) {
			frete = 20.0;};

		if ((basic > 100.0) && (basic < 200.0)) {
			frete = 12.0;};

		if (basic > 200.0) {
			frete = 0.0;};
			
		/*System.out.println(basic);
		System.out.println(frete);*/
	
		return frete;
	}

}
