package employeeob;

import objectprog.Student;

public class Employee 
{
  int id;
  String name;
  int salary;
  
  public Employee()
  {
	  System.out.println("No-arg constructor");
  }
  


  public Employee(int id)
 {
	this.id=id;
	System.out.println("id: "+ id);
 }
  
  public Employee(int id, String name)
  {
	  this(id);
	  this.name=name;
		System.out.println("id: "+ id+ " name: "+ name);
  }
  
  public Employee(int id, String name, int salary)
  {
	  this(id,name);
	  this.salary=salary;
	  System.out.println("id "+ id+ " name "+ name+ " salary: "+salary);
  }
  
 
}
  