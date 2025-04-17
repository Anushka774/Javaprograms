package comparableandcomparator;

public class EmployeeDriver

{
	public static void main(String[] args)
	{
		
	
     Employee emp1= new Employee(345, "Anushka", 78900.00);
     Employee emp2= new Employee(789, "Anika", 89007.0);
     
     
     if((emp1.compareTo(emp2))>0)
    	 System.out.println("Emp1 is greater");
     else if ((emp1.compareTo(emp2))==0)
    	 System.out.println("Both are equal");
     else
    	 System.out.println("Emp1 is smaller");
    	 
}
}
