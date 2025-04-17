package school;

public class Univeristy 
{
   Person[]  persons;
   static int count=0;
   
   
   
   public Univeristy(int size)
   {
	   this.persons=new Person[size];
   }
   
   public void addPerson(Person person)
   {
         if(count<persons.length)
         {
        	 persons[count++]=person;
         }
         else
        	 System.out.println("School is full");
        	 
   }
   
   public void showPeople()
   {
	   for(int i=0; i<count; i++)
		{
		    
			System.out.println("The name of the person is: "+persons[i].getName());
		}
   }
   
}
