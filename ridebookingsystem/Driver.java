package ridebookingsystem;

public class Driver extends User
{
	private boolean available;
	public Driver(String name, String id, boolean available )
	{
		super(name, id);
		this.available= true;
	}
	
	public boolean isAvailable()
	{
		
		return available;
	}
	
	public void setAvailable(boolean available)
	{
		this.available=available;
		
	}

	@Override
	public void showProfile() 
	{
		System.out.println("The driver's name is : " + name);
		if(isAvailable())
		{
			System.out.println("Driver is available");
		}
		
	}

}
