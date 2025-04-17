package linkedlist1;

import  java.util.*;

public class Employee implements Comparable<Employee>
{
	
		 int id;
		 String name;
		 
		 
		 public Employee(String name, int id)
		 {
			 this.name=name;
			 this.id=id;
		 }


		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}


		public int compareTo(Employee o) {
		    
			return this.id-o.id;
		}
}
