package vehicles;

public class Car extends Vehicle{
	
	private int numOfDoors;
	private boolean hasBluetooth;

	public Car(int id, String manufacturer, String colour, int numOfWheels, boolean isPetrol, boolean isElectric,
			 int numOfDoors, boolean hasBluetooth, int price) {
		super(id, manufacturer, colour, numOfWheels, isPetrol, isElectric, price);
		this.numOfDoors = numOfDoors;
		this.hasBluetooth = hasBluetooth;
	}

	public int getNumOfDoors() 
	{
		return numOfDoors;
	}

	public void setNumOfDoors(int newNumOfDoors) 
	{
		this.numOfDoors = newNumOfDoors;
	}

	public boolean getHasBluetooth() 
	{
		return hasBluetooth;
	}

	public void setHasBluetooth(boolean newHasBluetooth) 
	{
		this.hasBluetooth = newHasBluetooth;
	}

	@Override
	public void sound()
	{
		System.out.println("Car go brrrr");
	}
	
	
}
