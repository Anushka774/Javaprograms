package objectprog;

public class StudentDriver 
{
    public static void main(String[] args) 
    {
		Student S1= new Student();
		Student S2= new Student();
		
		System.out.println(S1.collegename+ " " + S1.id + " " + S1.name+"    "+S1.marks); 
		S1.work();
	}
}
