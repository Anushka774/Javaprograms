package one_to_many;

public class Bank 
{
	Customer[] customers;
	String bname;
	static int count=0;
	
	public Bank(int size, String bname)
	{
		this.customers= new Customer[size];
		this.bname=bname;
	}
	
	public void addCustomer(Customer customer)
	{
		if(count<customers.length)
		{
			customers[count++]=customer;
			System.out.println("Customer added");
		}
		
		else
			System.out.println("Cannot add customer");	
	}
	
	public void displaycustomer()
	{
		for(int i=0; i<count; i++)
		{
			System.out.println(customers[i].cname);
		}
	}

}
