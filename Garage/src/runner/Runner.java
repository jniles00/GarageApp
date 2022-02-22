package runner;

import Garage.Garage;
import vehicles.*;

public class Runner {

	public static void main(String[] args) {

		Car carOne = new Car(1, "Ford", "Red", 4, true, false, 4, false, 200);
		Motorbike bikeOne = new Motorbike(2, "Hayabusa", "Yellow", 2, true, false, 10, 500);
		Van vanOne = new Van(3, "Big Man Van", "White", 4, true, false, 10, 350);
		Car carTwo = new Car(4, "Honda", "Blue", 6, false, true, 6, false, 900);
		Motorbike bikeTwo = new Motorbike(5, "Ford", "Orange", 2, false, true, 5, 1000);
		
		Garage garage = new Garage();
		garage.addVehicle(carOne);
		garage.addVehicle(bikeOne);
		garage.addVehicle(vanOne);
		garage.addVehicle(carTwo);
		garage.addVehicle(bikeTwo);
		
		System.out.println("========All Vehicles============");
		garage.printVehicles();
		
//		System.out.println("\n=========Remove Vehicle==========");
//		garage.removeVehicle(vanOne);		
//		garage.printVehicles();
//		
//		System.out.println("\n========Remove by ID==============");
//		garage.removeVehicleByID(2);
//		garage.printVehicles();
//		
//		System.out.println("\n====Remove by Manufacturer=====");
//		garage.removeVehicleByManu("Ford");
//		garage.printVehicles();
//		
//		System.out.println("\n========Fix by Price==========");
//		System.out.println(garage.fixVehicleByID(4));
//		garage.printVehicles();
//		
//		System.out.println("\n========Empty Garage==========");
//		garage.emptyGarage();
//		garage.printVehicles();
		
		System.out.println("\n===Remove multiple by Manufacturer===");
		garage.removeVehiclesByManu("Ford");
		garage.printVehicles();

	}	
}