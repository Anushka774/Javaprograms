package user_post;
import java.util.*;


public class Driver 
{
	
	  public static void main(String[] args) 
	  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input array size");
		int size=sc.nextInt();
		
		User us= new User(size, "Anushka");
		boolean flag=true;
		
		while(flag)
		{
			System.out.println("Enter 1 to add post description and id\nEnter 2 to display post"+ "\nEnter 3 to exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter post name and id");
				String postdescript=sc.nextLine();
				int id=sc.nextInt();
			    Post post=new Post(postdescript, id);
			    us.addPost(post);
				break;
				
			case 2: 
				 us.displaypost();
				break;
				
			case 3:
				flag=false;
				break;
			}
		}
		
				
	  }
}


