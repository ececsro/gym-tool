package com.diduslabs.gymtool;

public class Item {
	String name;
	String description;
	boolean available;
	
	Item(String name, String price, boolean available) {
	      this.name = name;
	      this.description = price;
	      this.available  = available;
	}
}
