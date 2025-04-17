package phonebattery;

public class Phone {
	String phonename;
	Battery b;
	
	public Phone(String phonename, String batterytype)
	{
		this.phonename=phonename;
		this.b= new Battery(batterytype);
	}
  
	



	public void display()
	{
		System.out.println(this.phonename+ " " + b.batterytype);
	}
	
}
