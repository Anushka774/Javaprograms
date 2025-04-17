package queueusingarrays;
import java.util.*;
public class Queue 
{

    int size;
    int front=-1;
    int rear=-1;
    int arr[];
    
    
    public Queue(int size)
    {
    	this.size=size;
    	this.arr=new int[size];
    }
    
    public void enqueue(int size)
    {
    	front=0;
    	Scanner sc=new Scanner(System.in);
    	
    	int queue=sc.nextInt();
    	for(int i=front; i<size; i++)
    	{
    		System.out.println("Enter the data for queue");
    		arr[i]=sc.nextInt();
    		rear++;
    	}
    	
    	
    	System.out.println(Arrays.toString(arr));
    }
    
    public void dequeue()
    {
    	if(front==-1 && rear==-1)
    	{
    		System.out.println("Queue empty");
    	}
    	
    	else
    	{
    		front++;
    		for(int i=front; i<size; i++)
    		{
    			System.out.println(Arrays.toString(arr));
    		}
    		
    	}
    }
    
    public void peek()
    {
    	if(front==-1 && rear==-1)
    	{
    		System.out.println("Queue empty");
    	}
    	
    	else
    	{
    		System.out.println("Peek element is "+ arr[front]);
    	}
    }
    
    
    
}
