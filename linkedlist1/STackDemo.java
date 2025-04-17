package linkedlist1;

import java.util.Stack;

public class STackDemo 
{
  public static void main(String[] args) 
  {
	  
	  Stack st= new Stack();
	  st.push(1);
	  st.push(2);
	  st.push(3);
	  System.out.println(st);
	  
	  Stack st1= new Stack();
	  st1.add(10);
	  st1.add(20);
	  st1.add(30);
	  
	  System.out.println(st1);
	  System.out.println(st1.search(10));
	  System.out.println(st1.search(20));
	  
	  System.out.println(st.search(10));
	  System.out.println(st.get(0));
	  System.out.println(st1.get(0));
	  
	
}
  
  
}
