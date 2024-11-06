package com.bsc.order.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bsc.order.dto.Order;

@Service
public class OrderService {
	
	private static Map<Long, Order> orderRepo=new HashMap<Long,Order>();

	public boolean createOrder(Order order) {
		if(order !=null) {
			orderRepo.put(order.getId(),order);
			return true;
		}
		return false;
	}
	
	public Order getOrderById(long orderId) {
		
		if(orderRepo.containsKey(orderId)) {
			return orderRepo.get(orderId);
		}
		
		return null;
	}

	
	public List<Order> getAllOrders(){
		return orderRepo.entrySet().stream().map((key)->key.getValue()).collect(Collectors.toList());
		
	}
	
	
}
