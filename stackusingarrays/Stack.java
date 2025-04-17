package stackusingarrays;

import java.util.Arrays;
import java.util.Scanner;


public class Stack 
{
    int size;
    int top=-1;
    int arr[];
    
    
    public Stack(int size)
    {
    	this.size=size;
    	this.arr=new int[size];
    }
    
    public void push()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number of datas in stack");
        int stack=sc.nextInt();
    	for(int i=0; i<stack; i++)
    	{
    		 System.out.println("Enter data to input in stack");
    		  arr[i]=sc.nextInt();
    		  top++;
    	}
    	
    	 System.out.println("The stack is as follows");
    	 {
    		 for(int i=0; i<stack; i++)
    		 {
    			 System.out.println(Arrays.toString(arr));
    		 }
    	 }
    }
    
    public void pop()
    {
    	if(top==-1)
    	{
    		System.out.println("Stack empty");
    	}
    	
    	else
    	{
    		
    		top--;
    		System.out.println("Popped array " );
    		for(int i=0; i<top; i++)
    		{
    			System.out.print(arr[i] + " ");
    		}
    	}
    }
    
    public void peek()
    {
    	if(top==-1)
    	{
    		System.out.println("Stack empty");
    	}
    	 
    	System.out.println("Peek element " + arr[top]);
    	
    	
    }
    
}
