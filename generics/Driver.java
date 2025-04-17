package generics;

public class Driver 
{
	public static void main(String[] args)
	{
		Student<Person> student=new Student<Person>(new Person("Anushka", 10));
		printDetails(student);
	}
	
	public static void printDetails(Student<? extends Person>student)
	{
		Person p=student.obj;
		System.out.println(p);
	}

}
