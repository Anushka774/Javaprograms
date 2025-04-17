package generics;

public class Employee implements Comparable<Employee>
{
	String name;
	int id;
	
	
	public Employee(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}





	@Override
	public int compareTo(Employee o) 
	{
		Employee e=(Employee)o;
		return this.id-e.id;
	}





	
	
	

}
