package queueusingarrays;

import java.util.Scanner;



public class Driver 
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter size of array");
	   int size=sc.nextInt();
	   Queue st=new Queue(size);
	   st.enqueue(size);
	   st.peek();
	   st.dequeue();
}
}
