package ridebookingsystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class RideBookingSytem 
{
   List<Customer> customers;
   List<Driver> drivers;
   List<Ride> rides;
   
   
   public void registerCustomer(Customer customer)
   {
	   customers.add(customer);
   }
   
   public void registerDriver(Driver driver)
   {
	   drivers.add(driver);
   }
   
   Ride bookRide(Customer customer)
   {
	   List<Driver> AvailableDrivers = drivers.stream().filter(driver -> driver.isAvailable()).toList();
	   
			if(AvailableDrivers.isEmpty())   
			{
			 throw new InvalidRideException("No driver available");
			}
			
			else
				 rides.add(new Ride(customer, AvailableDrivers.getFirst(), "Booked" ));
			AvailableDrivers.getFirst().setAvailable(false);
			System.out.println("Ride is booked");
			
			return new Ride(customer, AvailableDrivers.getFirst(), "Unavailable");
   }
   
   void saveRides() throws IOException
   {
	  try
	  {
		  BufferedWriter bis = new BufferedWriter(new FileWriter("rides.text"));
		  for(Ride ride : rides)
		  {
			  bis.write(ride.RideDetails());
			  bis.newLine();
		  }
	  }
	  
	  catch(Exception e)
	  {
		  System.out.println("Error : " + e.getMessage());
	  }
   }
   
   void loadDriverFromFile()
   {
	   
   }
   
}
