package ridebookingsystem;

public class Customer extends User
{
   public Customer(String name, String id)
   {
	   super(name, id);
   }
   
   public void showProfile()
   {
	   System.out.println("Customer name is :" + name);
   }
}
