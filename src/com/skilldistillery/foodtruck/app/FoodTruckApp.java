package com.skilldistillery.foodtruck.app;

import java.util.Arrays;
import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

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
		System.out.println();
		System.out.println();
		System.out.println("** Please enter up to Five Food Trucks **");
		System.out.println();
		FoodTruck[] trucks = foodTruckApp.inputFoodTruck(scanner);
		
		boolean runMenu = true;
		while (runMenu) {
			foodTruckApp.printMenu();
			runMenu = foodTruckApp.chooseFromMenu(scanner, trucks);
		}

	}

	public FoodTruck[] inputFoodTruck(Scanner scanner) {

		com.skilldistillery.foodtruck.entities.FoodTruck[] foodTrucks = new FoodTruck[5];
		String foodType = "";
		double rating = 0;

		for (int i = 0; i <= foodTrucks.length; i++) {
			System.out.println("Enter a food truck's name or \"quit\" to go to Menu:");
			String truckName = scanner.nextLine();

			if (truckName.equalsIgnoreCase("quit")) {
				FoodTruck[] earlyExitArr = Arrays.copyOf(foodTrucks, i);
				return earlyExitArr;
			} else {

				System.out.println("Enter the type of food carried on truck: ");
				foodType = scanner.nextLine();

				do {
					System.out.println("Enter rating (0-5):");
					rating = scanner.nextDouble();
					if (rating > 5 || rating < 0) {
						System.out.println(" Invalid Entry! The rating was out of range. Please Try Again.");
					}
				} while (rating > 5 || rating < 0);
				scanner.nextLine();

				foodTrucks[i] = new FoodTruck();
				foodTrucks[i].setTruckName(truckName);
				foodTrucks[i].setFoodType(foodType);
				foodTrucks[i].setRating(rating);
				foodTrucks[i].setTruckId(i);

			}
		}
		return foodTrucks;
	}

	public void printMenu() {
		System.out.println();
		System.out.println("|*****************************************|");
		System.out.println("|-----------------------------------------|");
		System.out.println("| *         Food Truck MetaMenu:        * |");
		System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		System.out.println("|1. List all stored food trucks.          |");
		System.out.println("|2. See the average rating of food trucks.|");
		System.out.println("|3. Display the highest-rated food truck. |");
		System.out.println("|4. Quit the program.                     |");
		System.out.println("|_________________________________________|");
		System.out.println("|*****************************************|");
		System.out.println();
	}

	public boolean chooseFromMenu(Scanner scanner, FoodTruck[] trucks) {
		int selection = 0;

		do {
			System.out.println("Enter your selection (1-4): ");
			selection = scanner.nextInt();

			if (selection > 4 || selection < 1) {
				System.out.println("Invalid Entry! Selection out of range. Please Try Again.");
			}

		} while (selection > 4 || selection < 1);
		System.out.println();

		switch (selection) {
		case 1:
			truckList(trucks);

			break;

		case 2:
			ratingAverage(trucks);

			break;

		case 3:
			bestTruck(trucks);

			break;

		case 4:
			System.out.println("         |Signing Off|         ");
			System.out.println("_______________________________");
			System.out.println("*******Leaving Metaverse*******");
			return false;
		}
		return true;
	}

	public void truckList(FoodTruck[] trucks) {

		System.out.println("All food trucks parked in the Metaverse:");

		for (int i = 0; i < trucks.length; i++) {
			System.out.println(trucks[i].toString());
		}
	}

	public void ratingAverage(FoodTruck[] trucks) {

		double sumOfRatings = 0;

		for (int i = 0; i < trucks.length; i++) {
			sumOfRatings += trucks[i].getRating();
		}

		double average = sumOfRatings / trucks.length * 1.0;

		double roundedAverage = (Math.round((average) * 100.0)) / 100.0;

		System.out.println("Average food truck rating of stored food trucks: " + roundedAverage);
	}

	public void bestTruck(FoodTruck[] trucks) {

		double highRating = trucks[0].getRating();

		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i].getRating() > highRating) {
				highRating = trucks[i].getRating();
			}
		}

		int truckTies = 0;

		for (int i = 0; i < trucks.length; i++) {
			if (highRating == trucks[i].getRating()) {
				truckTies++;
			}
		}

		if (truckTies > 1) {
			System.out.println("There are " + truckTies + " food trucks tied for the Best Truck");
		} else {
			System.out.println("The Best Food Truck in the verse is:");
		}

		for (int i = 0; i < trucks.length; i++) {
			if (highRating == trucks[i].getRating()) {
				System.out.println(trucks[i].toString());
			}
		}
	}

}
