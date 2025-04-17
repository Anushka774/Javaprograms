package calcappmaker;
import java.util.*;
public class Calcapp {
	public static void main(String[] args)
	{
		calcappmenu();
	}
	
	public static void calcappmenu() 
	{
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for division");
		System.out.println("Press 5 to exit");
		System.out.println();
		
		
		
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		while(choice!=0)
		{
			switch(choice)
		
		{
		case 1: {
			Calculator.addMenu();
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for subtraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 to exit");
			System.out.println();
			Scanner sc=new Scanner(System.in);
			int choice1=sc.nextInt();
			choice1=choice;
			break;
			
		     }
		case 2:
		    {
			Calculator.subMenu();
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for subtraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 to exit");
			System.out.println();
			Scanner sc=new Scanner(System.in);
			int choice1=sc.nextInt();
			choice1=choice;
			break;
			
		     }
		    
		    
		case 3:
		   {
			Calculator.mulMenu();
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for subtraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 to exit");
			System.out.println();
			Scanner sc=new Scanner(System.in);
			int choice1=sc.nextInt();
			choice1=choice;
			break;
			
		     }
		case 4:
	    	{
			Calculator.divMenu();
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for subtraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");
			System.out.println("Press 5 to exit");
			System.out.println();
			Scanner sc=new Scanner(System.in);
			int choice1=sc.nextInt();
			choice1=choice;
			break;
			
		     }
	    	
	    	
	    	default:
	    	{
	    		System.out.println("Thank you");
	    		break;
	    	}
		}
			
			
		
		
	}

 }
}
