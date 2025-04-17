package doublylinkedlist;

public class DoublyLL 
{
     Node head;
     Node tail;
     static int count;
     
     public void insert(int data)
     {
    	 Node node=new Node(data);
    	 if(head==null)
    	 {
    		 head=node;
    		 tail=node;
    		 node.previous=null;
    		 node.next=null;
    	 }
    	 
    	 else
    	 {
    	
    		 tail.next=node;
    		 node.previous=tail;
    		 tail=node;
    		 count++;
    	 }
    	 
     }
     
     public void displayforward()
     {
    	 Node current=head;
    	 while(current!=null)
    	 {
    		 System.out.println(current.data+" ");
    		 current=current.next;
    	 }
    	 System.out.println();
     }
     
     public void displaybackward()
     {
    	 Node current=tail;
    	 while(current!=null)
    	 {
    		 System.out.println(current.data+" ");
    		 current=current.previous;
    	 }
    	 System.out.println();
     }
     
     public void update(int position, int data)
     {
    	 if(head==null)
    	 {
    		 System.out.println("No data to update");
    		 return;
    	 }
    	 
    	 if(position==1)
    	 {
    		 head.data=data;
    		 return;
    	 }
    	 
    	 
    	 if(position==count)
    	 {
    		 tail.data=data;
    		 return;
    	 }
    	 
    	 Node current=head;
    	 int i=1;
    	 while(current!=null)
    	 {
    		 if(i==position)
    		 {
    			 current.data=data;
    			 return;
    		 }
    		 i++;
    		 current=current.next;
    	 }
     }
     
     public void insertAt(int position, int data)
     {
    	 Node node=new Node(data);
    	 if(head==null)
    	 {
    		 head=node;
    		 tail=node;
    		 count++;
    		 return;
    	 }
    	 
    	 if(position<1 || position>count)
    	 {
    		 System.out.println("Position invalid");
    		 return;
    	 }
    	 
    	 if(position==1)
    	 {
    		 node.next=head;
    		 head.previous=node;
    		 head=node;
    		 count++;
    		 return;
    	 }
    	 
    	 if(position==count)
    	 {
    		 Node current=tail;
    		 current=current.previous;
    		 current.next=node;
    		 node.previous=current;
    		 node.next=tail;
    		 tail.previous=node;
    		 count++;
    		 return;
    	 }
     }
    		 
}
