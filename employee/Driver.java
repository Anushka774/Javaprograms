package employee;

public class Driver 
{
	public static void main(String[] args) 
{
		
	
     Employee e1=new FullTimeEmployee("Anushka", 500000.00, 30000);
   

     Employee emp2= new PartTimeEmployee("Tanima", 300000.00, 6);
   
     thedetails(e1);
     thedetails(emp2);
     
    
}
	
	 
    static void thedetails(Employee e)
    {
   	   if(e instanceof FullTimeEmployee)
   	   {
   		   e.jobrole();
   	   }
   	   
   	   else
   	   {
   		   e.jobrole();
   	       ((PartTimeEmployee)e).jobdesignation();
        }
    }
}
	

