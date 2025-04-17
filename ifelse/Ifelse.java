package ifelse;
import java.util.*;

public class Ifelse {

	  public static void main(String[] args)
	  {
		  System.out.println("Enter a numbers");
		 Scanner sc=new Scanner(System.in);
		 int num1=sc.nextInt();
		 if(num1>0 && num1%2==0)
			 System.out.println("positive even");
		 else if(num1>0 && num1%2!=0)
			 System.out.println("positive odd");
		 else if(num1<0 && num1%2!=0)
			 System.out.println("negative odd");
		 else
			 System.out.println("negative even");
	}
}
