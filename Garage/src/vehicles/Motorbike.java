package vehicles;

public class Motorbike extends Vehicle {
	
	private int handleBarWidth;
	
	public Motorbike(int id, String manufacturer, String colour, int numOfWheels, boolean isPetrol, boolean isElectric,
			int handleBarWidth, int price) 
	{
		super(id, manufacturer, colour, numOfWheels, isPetrol, isElectric, price);
		this.handleBarWidth = handleBarWidth;
	}

	public int getHandleBarWidth() 
	{
		return handleBarWidth;
	}

	public void setHandleBarWidth(int newHandleBarWidth) 
	{
		this.handleBarWidth = newHandleBarWidth;
	}

	@Override
	public void sound()
	{
		System.out.println("Motorbike go mrrrrr");
	}
}
