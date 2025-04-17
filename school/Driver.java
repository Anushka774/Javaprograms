package school;
import java.util.*;

public class Driver 
{
  public static void main(String[] args) 
  {
	Univeristy u=new Univeristy(5);
	boolean flag=true;
	
	while(flag)
	{
		System.out.println("Enter 1 to enter student name\nEnter 2 to enter professor name");
		System.out.println("Enter 3 to exit");
		 Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
	   switch(choice)
	   {
	   case 1:
		   System.out.println("Enter name, age and student id of the student");
		   Scanner sc1=new Scanner(System.in);
		   String st=sc1.nextLine();
		   int age=sc1.nextInt();
		   int id=sc1.nextInt();
		   Person p=new Student(st,age,id);
		   u.addPerson(p);
		   ((Student) p).displayInfo();
		   break;
		   
		   
		   
	   case 2:
		   System.out.println("Enter name, age and specialization of the professor");
		   Scanner sc2=new Scanner(System.in);
		   String pf=sc2.nextLine();
		   int agepf=sc2.nextInt();
		   
		   String spec=sc2.next();
		   
		   Person proff=new Professor(pf,agepf,spec);
		   u.addPerson(proff);
		  ((Professor)proff).displayInfo();
		  break;
		  
		  
		case 3:
			flag=false;
			break;
		   
		  
	   }
	   
	   
	   
	   
	}
  }
}
