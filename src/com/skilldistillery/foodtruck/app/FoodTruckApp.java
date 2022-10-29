package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import practice.FoodTruck;

public class FoodTruckApp {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		FoodTruckApp foodTruckApp = new FoodTruckApp();
		
		foodTruckApp.startApp(scanner, foodTruckApp);
		
		scanner.close();
		
		
	}
	
	public void startApp(Scanner scanner, FoodTruckApp foodTruckApp) {
		System.out.println("                       ...Starting...                          ");
		System.out.println("_______________________________________________________________");
		System.out.println("|*___________________|Food Truck Metaverse|__________________*|");
		System.out.println("---------------------------------------------------------------");
		FoodTruck[] trucks = foodTruckApp.inputFoodTruck(scanner);
		

	}

	public FoodTruck[] inputFoodTruck(Scanner scanner) {
		
		com.skilldistillery.foodtruck.entities.FoodTruck[] foodTrucks = new FoodTruck[5];
		String foodType = "";
		double rating = 0;
		
		for (int i = 0; i <= foodTrucks.length; i++) {
			System.out.println("Enter a food truck's name or \"quit\" to go to Menu:");
			String truckName = scanner.nextLine();

			
			
		}
		
	}
	
}
