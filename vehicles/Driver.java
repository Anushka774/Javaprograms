package vehicles;

public class Driver 
{
	
	public static void main(String[] args)
	{
		
		Bike b=new Bike("4536WB", "HeroHonda", "V8", 20345.90, true, true);
		b.displayDetails();
		Car c=new Car("3456WB", "i10", "V8", 36353.77, true, 4);
		c.displayDetails();
	}

}
