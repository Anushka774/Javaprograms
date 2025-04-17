package comparableandcomparator;

public class Person implements Comparable
{
   int age;
   String name;
   
   public Person(int age, String name)
   {
	   this.age=age;
	   this.name=name;
   }

@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + "]";
}

@Override
public int compareTo(Object o) {
	Person p= (Person) o;
	if(this.name.compareTo(p.name)!=0)
	{
		return this.name.compareTo(p.name);
	}
	
	if(this.age-p.age!=0)
	{
		return this.age-p.age;
	}
	
	
	return 0;
}
   
   
   
}
