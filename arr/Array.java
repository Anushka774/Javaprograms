package arr;
import java.util.*;

public class Array 
{
    public static void main(String[] args)
    {
    	
    	palindrome(takenumber());
    }
    
    public static int[] takenumber()
    {
    	int length;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Input the array length");
    	length=sc.nextInt();
    	int[] arr=new int[length];
    	System.out.println("Enter the array elements of 3 digit numbers");
    	for(int i=0; i<length; i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	
    	return arr;
  }
    
    
    public static void palindrome(int[] arrnew)
    {
    	int len=arrnew.length;
    	for(int i=0; i<len; i++)
    	{
    		int last=arrnew[i]%10;
    		int first=arrnew[i]/100;
    		if(first==last)
    			System.out.println("palindrome");
    		else
    			System.out.println("not palindrome");
    	}
    	
    }
}
