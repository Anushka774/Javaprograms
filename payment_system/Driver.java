package payment_system;
import java.util.*;
public class Driver 
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter amount to be paid in $: ");
	  double am=sc.nextDouble();
	  
	  boolean flag=true;
	  
	  while(flag)
	  { System.out.println("Enter 1 to process payment from CreditCard\nEnter 2 to process payment from PayPal");
		System.out.println("Enter 3 to exit");;
	  int choice=sc.nextInt();
	 
	   switch(choice)
	   {
	   case 1:
		   Scanner sc1=new Scanner(System.in);
		   System.out.println("Your Transaction ID for CreditCard is:");
		   String tid=sc1.nextLine();
		   Payment p=new CreditCard(am, tid);
		   p.processPayment();
		   break;
		   
		   
	   case 2:
		   Scanner sc2=new Scanner(System.in);
		   System.out.println("Your Transaction ID for PayPal is:");
		   String tid1=sc2.nextLine();
		   Payment p1=new PayPal(am, tid1);
		   p1.processPayment();
		   break;
		   
	   case 3: flag=false;
	   break;
		   
		   
		

	   }
	  
	
   }
  }
}


