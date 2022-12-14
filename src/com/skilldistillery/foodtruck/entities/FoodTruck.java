package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String truckName;
	private String foodType;
	private double rating;
	private int truckId;
	private static int nextTruckId = 100;
	
	public FoodTruck() {
		
	}
	
	public FoodTruck(String truckName, String foodType, double rating, int truckId) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
		this.truckId = truckId;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = nextTruckId;
		nextTruckId++;
	}

	public static int getNextTruckId() {
		return nextTruckId;
	}

	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Food Truck Name: ").append(truckName).append(", Food Type: ").append(foodType).append(",Rating: ").append(rating).append(", and Truck ID: ").append(truckId).append(".");
		return builder.toString();
	}

}
