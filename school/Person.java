package school;

public class Person 
{
    private String name;
    private int age;
    
    
    public Person(String name, int age)
    {
    	this.setName(name);
    	this.age=age;
    }
    
    public void displayInfo()
    {
    	System.out.print( this.getName()+" "+ this.age);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
