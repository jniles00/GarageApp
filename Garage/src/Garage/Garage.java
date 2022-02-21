package Garage;

import java.util.ArrayList;
import vehicles.*;

public class Garage {

	public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle vehicle) {
		// this.addVehicle(vehicle);
		this.vehicles.add(vehicle);
	}
	
	public void removeVehicle(Vehicle vehicle)
	{
		this.vehicles.remove(vehicle);
	}
	
	
	public void removeVehicleByID(int i)
	{
		Vehicle remove = null;
		for(Vehicle vehicles : vehicles)
		{			
			if (vehicles.getID() == i)
			{
				remove = vehicles;
			}
			removeVehicle(remove);
		}
	}
	
	public void removeVehicleByManu(String s)
	{
		Vehicle remove = null;
		for(Vehicle vehicles : this.vehicles)
		{			
			if (vehicles.getManufacturer() == s)
			{
				remove = vehicles;
			}
			removeVehicle(remove);
		}
	}
	
	// Array method
//	public void removeVehicleByManu(int i)
//	{
//		ArrayList<Vehicle> remove = new ArrayList<>();
//		for(Vehicle vehicle : vehicles)
//		{
//			if(vehicle.getID() == i)
//			{
//				remove.add(vehicle);
//			}
//		}
//		remove.remove(i);
//	}
	
	public int fixVehicleByID(int i)
	{
		int fix = 0;
		for(Vehicle vehicles : this.vehicles)
		{
			fix = vehicles.getPrice();
		}
		return fix = fix / 2;
	}
	
	public void printVehicles() {
		for (Vehicle vehicle : this.vehicles) {
			System.out.println(vehicle);
		}
	}
}