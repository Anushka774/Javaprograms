package person_student;

public class Person 
{
    private String name;
    private int age;
    
    public Person(String name, int age)
    {
    	this.name=name;
    	this.age=age;
    }
    
    public void displaayPersonDetails()
    {
    	System.out.println("All student details: " + this.name+" "+this.age);
    }
}
