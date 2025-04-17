package methodchaining;

public class Student 
{
  String name;
  int id;
  
  
  
  public Student setname(String name)
  {
	  this.name=name;
	  return this;
	  
  }
  
  public Student setId(int id)
  {
	  this.id=id;
  }
  
  public void display()
  
  {
	  System.out.println(this.name+" " + this.id);
  }
  
  
}
