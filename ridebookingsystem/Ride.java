package ridebookingsystem;

public class Ride
{
  Customer customer;
  Driver driver;
  String status;
  
  public Ride(Customer customer, Driver driver, String status)
  {
	  this.customer = customer;
	  this.driver = driver;
	  this.status= status ;
  }
  
  
  public void completeRide()
  {
	  status = "Completed" ;
  }
  
  public String getStatus()
  {
	  
	  return status;
  }
  
  public String RideDetails()
  {
	return "[Customer :" + customer.name + "] " + " [ Driver :" + driver.name + "] " + " [Status :" + status + "]" ;
	  
  }
  
}
