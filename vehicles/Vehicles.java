package vehicles;

public class Vehicles 
{
   private String vehicleNumber;
   private String brand;
   private String model;
   private double rentalPricePerDay;
   private boolean isAvailable;
   
   public Vehicles(String vehicleNumber, String brand,
   String model, double rentalPricePerDay,boolean isAvailable)
   {
	   this. vehicleNumber= vehicleNumber;
	   this.brand=brand;
	   this.model=model;
	   this.rentalPricePerDay=rentalPricePerDay;
	   this.isAvailable=isAvailable;
	   
   }
   
   public void displayDetails()
   {
	   if(isAvailable==true)
	   {
		   System.out.print(this.vehicleNumber+ " "+ this.brand+" " + this.model+ " " + this.rentalPricePerDay);
	   }
   }
   
}
