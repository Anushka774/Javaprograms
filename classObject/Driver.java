package classObject;

public class Driver extends Employee
{
    public static void main(String[] args) 
    {
		Employee obj=new Employee("anushka", 10000);
		Object o=obj.clone();
	}
}
