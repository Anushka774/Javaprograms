package employee;

public class PartTimeEmployee extends Employee 
{
    private int workingHours;
    
    public PartTimeEmployee(String name, double salary, int workingHours)
    {
    	super(name, salary);
    	this.workingHours=workingHours;
    }
    
    
    public void employeeInfo()
    {
    	super.employeeInfo();
    	System.out.println(" " + this.workingHours);
    }
    
    public void jobrole()
    {
 	   System.out.println("Job role of PartTimeEmployee is cloud engineer");
    }
    
    public void jobdesignation()
    {
    	System.out.println("Associate");
    }
    
}
