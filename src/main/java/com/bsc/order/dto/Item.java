package com.bsc.order.dto;

import lombok.Data;

@Data
public class Item {
	private long itemId;
	private String name;
	private long qty;
	private double price;
}
