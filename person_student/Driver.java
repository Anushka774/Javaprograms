package person_student;
import  java.util.*;
public class Driver 
{
     public static void main(String[] args)
     
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Input name");
    	 String name=sc.nextLine();
    	 System.out.println("Input age");
    	 int age=sc.nextInt();
    	 System.out.println("Input studentId");
    	 int studentId=sc.nextInt();
    	 
    	 
    	 Student s=new Student(name,age,studentId);
    	 s.displayStudentdetails();
    	 
     }
}
