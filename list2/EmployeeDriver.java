package list2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class EmployeeDriver 
{
  public static void main(String[] args) 
  {
	ArrayList<Employee> e = new ArrayList<>();
	e.add(new Employee("Anushka", 1));
	e.add(new Employee("Anu", 1));
	e.add(new Employee("VM", 1));
	
	for(Employee emp : e)
	{
		System.out.println(emp);
	}
	
/*	Iterator<Employee> itr= e.iterator() ;
	while(itr.hasNext())
	{
		Employee n = itr.next();
		if(n.name.equals("Anu"))
		{
			itr.remove();
			
		}
	}
	
	*/
	
	ArrayList<Integer>  al= new ArrayList<>();
	
	al.add(10);
	al.add(9);
	al.add(7);
	Collections.sort(al);
	
	System.out.println(e);
	
	ListIterator list=e.listIterator();
	while(list.hasNext())
	{
		System.out.println("Index "+ list.nextIndex()+ " Element" + list.next());
	}
	ArrayList<Integer> in=new ArrayList<>();
	in.add(10);
	in.add(20);
	in.add(30);
	in.add(40);
	in.add(50);
	
	for(int i: in)
		System.out.println(i);
	
	
	
	
  }
}
