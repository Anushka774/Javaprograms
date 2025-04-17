package vehicles;

public class Car extends Vehicles

{
		  private int numberOfDoors;
		   
		   public Car (String vehicleNumber, String brand,String model, double rentalPricePerDay, boolean isAvailable, int numberOfDoors)
		   {
			   super(vehicleNumber, brand, model, rentalPricePerDay,isAvailable);
			   this.numberOfDoors=numberOfDoors;
		   }
		   
		   
		   public void displayDetails()
		   {
			   super.displayDetails();
			   System.out.println(" " + this.numberOfDoors);
		   }
}
		   
	
