package ridebookingsystem;

public abstract class User 
{
   protected String id;
   protected String name;
   
   public User(String name, String id)
   {
	   this.name = name;
	   this.id=id;
   }
   
   public abstract void showProfile();
}
