package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		FoodTruckApp foodTruckApp = new FoodTruckApp();
		
		foodTruckApp.startApp(scanner, foodTruckApp);
		
		scanner.close();
		
		
	}
	
	public void startApp(Scanner scanner, FoodTruckApp foodTruckApp) {
		
	}

}
