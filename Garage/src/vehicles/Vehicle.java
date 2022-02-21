package vehicles;

public class Vehicle {
	
	private String manufacturer, colour;
	private int numOfWheels, id, price;
	private boolean isPetrol, isElectric;
		
	public Vehicle(int id, String manufacturer, String colour, int numOfWheels, boolean isPetrol, boolean isElectric, int price)
	{
		this.id = id;
		this.manufacturer = manufacturer;
		this.colour = colour;
		this.numOfWheels = numOfWheels;
		this.isPetrol = isPetrol;
		this.isElectric = isElectric;
		this.price = price;
	}

	public int getID()
	{
		return id;
	}
	
	public void setID(int id)
	{
		this.id = id;
	}
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	public void setManufacturer(String newManufacturer)
	{
		this.manufacturer = newManufacturer;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public void setColour(String newColour)
	{
		this.colour = newColour;
	}

	public int getNumOfWheels()
	{
		return numOfWheels;
	}
	
	public void setNumOfWheels(int newNumOfWheels)
	{
		this.numOfWheels = newNumOfWheels;
	}
	
	public boolean getIsPetrol()
	{
		return isPetrol;
	}
	
	public void setIsPetrol(boolean newIsPetrol)
	{
		this.isPetrol = newIsPetrol;
	}

	public boolean getIsElectric() 
	{
		return isElectric;
	}

	public void setIsElectric(boolean newIsElectric) 
	{
		this.isElectric = newIsElectric;
	}
	
	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int newPrice) 
	{
		this.price = newPrice;
	}
	
	@Override
	public String toString() {
		return "Vehicle [id: " + id + ","
	+ "manufacturer: " + manufacturer + 
	"," + " colour: " + colour + 
	", numOfWheels: " + numOfWheels + 
	", isPetrol: " + isPetrol + 
	", isElectric: " + isElectric + 
	", price: " + price + "]";
	}
	
	public void sound()
	{
		System.out.println("Vehicle go...");
	}
}