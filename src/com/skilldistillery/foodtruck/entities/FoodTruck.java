package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String truckName;
	private String foodType;
	private double rating;
	private int truckId;
	private static int nextTruckId = 1000;
	
	public FoodTruck() {
		
	}
	
	public FoodTruck(String truckName, String foodType, double rating, int truckId) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
		this.truckId = truckId;
	}

}
