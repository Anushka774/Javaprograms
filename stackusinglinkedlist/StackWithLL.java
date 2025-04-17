package stackusinglinkedlist;



public class StackWithLL 
{
     Node head;
     Node top;
     static int count;
     
     public void push(int data)
     {
    	 Node node=new Node(data);
    	
    	 node.next=top;
    		 top=node;
    	
    		 
    		 
    	 }
     
     
     public void display()
     {
    	 if(top==null)
    	 {
    		 System.out.println("No data to display");
    	 }
    	 
    	 Node current=top;
    	 while(current!=null)
    	 {
    		 System.out.println(current.data+" ");
    		 current=current.next;
    	 }
    	 System.out.println();
     }
     
     public int peek()
     
     {
    	 if(top==null)
    	 {
    		 throw new RuntimeException("Stack is empty");
    	 }
    	 
    	 return top.data;
     }
     
     public int pop()
     {
    	 if(top==null)
    	 {
    		 throw new RuntimeException("Stack is empty");
    	 }
    	 
    	 Node current=top;
    	 int data=current.data;
     }
}
