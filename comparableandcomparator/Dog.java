package comparableandcomparator;
import java.util.*;
public class Dog implements Comparable
{
    String name;
    int age;
    String breed;
    
    
    
  public Dog(String name, int age, String breed)
  {
	  this.name=name;
	  this.age=age;
	  this.breed=breed;
  }






@Override
public String toString() {
	return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
}






@Override
public int compareTo(Object o) {
   Dog d=(Dog) o;
   if(this.name.compareTo(d.name)!=0)
   {
	   return this.name.compareTo(d.name);
   }
   
   if(this.age-d.age!=0)
   {
	   return this.age-d.age;
   }
   
   
	return 0;
}
  



public static void main(String[] args) 
{
	Dog[] dog=new Dog[3];
	 dog[0]=new Dog("D1", 6, "Aslatian");
	 dog[1]=new Dog("D2", 2, "Husky");
	 dog[2]=new Dog("D3", 4, "German Shephard");
	 
	 
	 Arrays.sort(dog, new CompareBreed());
	for(Dog i:dog) 
	{
		System.out.println(i);
	}
	
}



  
}
