package many_to_many;
import java.util.*;
public class Driver 
{
  public static void main(String[] args) 
  {
	Students s1=new Students("Rohit",  3);
	Students s2=new Students("Ram",  2);
	
	Course c1=new Course("Java", 3);
	Course c2=new Course("Python", 2);
	Course c3=new Course("AIML", 5);
	
	s1.addCourse(c1);
	s1.addCourse(c2);
	s2.addCourse(c3);
	s2.addCourse(c1);
	
	System.out.println(Arrays.toString(s1.arr)+ " "+ Arrays.toString(s2.arr));
  }
}
