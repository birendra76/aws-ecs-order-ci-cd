package com.bsc.order.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Order {
private long id;
private List<Item> itemList=new ArrayList<>();
private double totalPrice;

}
