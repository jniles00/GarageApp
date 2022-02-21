package vehicles;

public class Van extends Vehicle{
	
	private int storageSpace;
	


	public Van(int id, String manufacturer, String colour, int numOfWheels, boolean isPetrol, boolean isElectric,int storageSpace ,int price) {
		super(id, manufacturer, colour, numOfWheels, isPetrol, isElectric, price);
		this.storageSpace = storageSpace;
	}

	public int getStorageSpace() 
	{
		return storageSpace;
	}

	public void setStorageSpace(int newStorageSpace) 
	{
		this.storageSpace = newStorageSpace;
	}
	
	@Override
	public void sound()
	{
		System.out.println("Van go vrrrrr");
	}
}
