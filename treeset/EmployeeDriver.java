package treeset;
import java.util.*;
public class EmployeeDriver 
{
	
	public static void main(String[] args) 
	{
		
	
      TreeSet<Employee> ts= new TreeSet<>();
    
      ts.add(new Employee("HP", 4579.00));
      ts.add(new Employee("Anu", 8979.00));
      ts.add(new Employee("Ami", 9979.00));
     
      
      Iterator<Employee> itr= ts.iterator();
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
      
      
    
   }
}
