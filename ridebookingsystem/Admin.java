package ridebookingsystem;

import java.util.Iterator;
import java.util.List;

@SecurityCheck(role = "Admin")
 public class Admin extends User
{
    
	
	public Admin(String name, String id) 
	{
		super(name, id);
	
	}
	
	
	Class<SecurityCheck> c = SecurityCheck.class;
	SecurityCheck s = c.getDeclaredAnnotation(SecurityCheck.class);

	@Override
	public void showProfile() 
	{
		System.out.println("Name : " + this.name + " Role : " + s.role()) ;
		
	}
	
	public void removeDriver(List<Driver> drivers, String DriverId )
	{
		try
		{  boolean removedDriver = false;
			if(s.role().equals("Admin"))
			{
				Iterator<Driver> itr = drivers.iterator();
				while(itr.hasNext())
				{
					Driver driver = itr.next();
					
					if(driver.id.equals(DriverId))
					{
						itr.remove();
						removedDriver=true;
						System.out.println("Driver: " + driver.name+ " with driver details " + driver.id + "is removed");
						break;
					}
					
					if(!removedDriver)
					{
						System.out.println("Invalid Driver id");
					}
				
						
				}
			}
		}
		
		catch(Exception e)
		{
			System.out.println("Security Check not passed!");
		}
	}
  
}
