package many_to_many;

public class Course 
{
  String name;
  Students[] students ;
  
  Course(String name, int size)
  {
	  this.name=name;
	  this.students=new Students[size];
  }
}
