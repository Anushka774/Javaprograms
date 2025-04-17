package calcappmaker;
import java.util.*;
public class Calculator 
{
   public static void addMenu()
   {
	   System.out.println("Press 1 to add 2 numbers");
	   System.out.println("Press 2 to add 3 numbers");
       System.out.println();
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter your choice");
	   int choice=sc.nextInt();
	    switch(choice)
	    {
	    case 1:
	    	System.out.println("Enter two numbers");
	    	Scanner sc=new Scanner(System.in);
	 	   System.out.println("Enter your first number");
	 	   int num1=sc.nextInt();
	 	  System.out.println("Enter your second number");
	 	   int num2=sc.nextInt();
	 	   int output1=num1+num2;
	 	   System.out.println("The output is"+ output1);
	 	   break;
	 	   
	    case 2:
	    	System.out.println("Enter three numbers");
	    	Scanner sc=new Scanner(System.in);
	 	   System.out.println("Enter your first number");
	 	   int num11=sc.nextInt();
	 	  System.out.println("Enter your second number");
	 	   int num12=sc.nextInt();
	 	  System.out.println("Enter your third number");
	 	   int num13=sc.nextInt();
	 	   int output2=num1+num2+num13;
	 	   System.out.println("The output is"+ output2);
	 	   break;
	    	
	 	   
	    }
	    
	    
	    public static void mulMenu()
	    {
	 	   System.out.println("Press 1 to multiply 2 numbers");
	 	   System.out.println("Press 2 to multiply 3 numbers");
	       System.out.println();
	 	   
	 	   Scanner sc=new Scanner(System.in);
	 	   System.out.println("Enter your choice");
	 	   int choice=sc.nextInt();
	 	    switch(choice)
	 	    {
	 	    case 1:
	 	    	System.out.println("Enter two numbers");
	 	    	Scanner sc=new Scanner(System.in);
	 	 	   System.out.println("Enter your first number");
	 	 	   int num1=sc.nextInt();
	 	 	  System.out.println("Enter your second number");
	 	 	   int num2=sc.nextInt();
	 	 	   int output1=num1*num2;
	 	 	   System.out.println("The output is"+ output1);
	 	 	   break;
	 	 	   
	 	    case 2:
	 	    	System.out.println("Enter three numbers");
	 	    	Scanner sc=new Scanner(System.in);
	 	 	   System.out.println("Enter your first number");
	 	 	   int num11=sc.nextInt();
	 	 	  System.out.println("Enter your second number");
	 	 	   int num12=sc.nextInt();
	 	 	  System.out.println("Enter your third number");
	 	 	   int num13=sc.nextInt();
	 	 	   int output2=num1*num2*num13;
	 	 	   System.out.println("The output is"+ output2);
	 	 	   break;
	 	    	
	 	 	   
	 	    }
	   
	   
      }
	    
	    public static void divMenu()
	    {
	 	 
	 	   Scanner sc=new Scanner(System.in);
	 	   System.out.println("Enter 2 numbers");
	 	   double num1=sc.nextDouble();
	 	   double num2=sc.nextDouble();
	 	   double output=num1/num2;
	 	   System.out.println("The output is"+ output);

        }
	   
	    public static void subMenu()
	    {
	 	 
	 	   Scanner sc=new Scanner(System.in);
	 	   System.out.println("Enter 2 numbers");
	 	   double output;
	 	   double num1=sc.nextDouble();
	 	   double num2=sc.nextDouble();
	 	   if(num1>num2)
	 	   output=num1-num2;
	 	   else
	 		   output=num2-num1;
	 	   System.out.println("The output is"+ output);

        }
   
   
   
   
   
}
