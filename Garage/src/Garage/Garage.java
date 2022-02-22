package Garage;

import java.util.ArrayList;
import vehicles.*;

public class Garage {

	public ArrayList<Vehicle> vehiclesArr = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle vehicle) {
		// this.addVehicle(vehicle);
		this.vehiclesArr.add(vehicle);
	}
	
	public void removeVehicle(Vehicle vehicle)
	{
		this.vehiclesArr.remove(vehicle);
	}
	
	
	public void removeVehicleByID(int i)
	{
		Vehicle remove = null;
		for(Vehicle vehicles : vehiclesArr)
		{//DataType| Item		Array	
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
		for(Vehicle vehicles : this.vehiclesArr)
		{			
			if (vehicles.getManufacturer() == s)
			{
				remove = vehicles;
			}
			removeVehicle(remove);
		}
	}
	
	public void emptyGarage()
	{
		this.vehiclesArr.clear();
	}
	
	 // remove multiple vehicles by manufacturer
	public void removeVehiclesByManu(String s)
	{
		ArrayList<Vehicle> removeArr = new ArrayList<>();
		for(Vehicle vehicle : vehiclesArr)
		{
			if(vehicle.getManufacturer() == s)
			{
				removeArr.add(vehicle);
			}
		}
		
		for(Vehicle destroy : removeArr)
		{
			vehiclesArr.remove(destroy);
		}
	}
	
	public int fixVehicleByID(int i)
	{
		int fix = 0;
		
		for(Vehicle vehicles : this.vehiclesArr)
		{

			fix = vehicles.getPrice();

		}
		return fix = fix / 2;	
	}
	
	public void printVehicles() {
		for (Vehicle vehicle : this.vehiclesArr) {
			System.out.println(vehicle);
		}
	}
}