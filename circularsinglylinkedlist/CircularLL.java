package circularsinglylinkedlist;

public class CircularLL {
	
	
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
				node.next=head;
				count++;
		}
			
			else
			{
				tail.next=node;
				tail=node;
				tail.next=head;
				count++;
			}
				
	}
		
		public void display()
		{
			if(head==null)
			{
				System.out.println("List is empty");
				return;
			}
			
			else
			{
				Node current=head;
				do
				{
					System.out.println(current.data+" ");
					current=current.next;
				}
				while(current!=head);
			}
		}
		
		public void insertAt(int data, int position)
		{
			Node node=new Node(data);
			if(position<1)
			{
				System.out.println("Invalid position");
				return;
			}
			
			if(position>count)
			{
				System.out.println();
			}
			
			if(position==1)
			{
				node.next=head;
				head.next=node;
				count++;
			}
			
			if(position==count)
			{
			   Node current=head;
			   int i=1;
			   while(i<count-1)
			   {
				   current=current.next;
			   }
			   
			   current.next=node;
			}
		}
		
		public void update(int position, int data)
		{
			if(position==data)
			{
				head.data=data;
				return;
			}
			
			if(position==count)
			{
				tail.data=data;
				return;
			}
			
			if(position>count || position<1)
			{
				System.out.println("Invalid position");
				return;
			}
			
			Node current=head;
			int index=1;
			
			while(current.next!=head)
			{
				if(index==position)
				{
					current.data=data;
					return;
				}
				index++;
				current=current.next;
			}
		}
		
		public void delete(int position)
		{
			if(position<1 || position>1)
			{
				System.out.println("Invalid position");
				return;
			}
			
			if(head==null)
			{
				System.out.println("No data to delete");
				return;
			}
			
			Node lastnode=head;
			do
			{
				lastnode=lastnode.next;
			}
			
			while(lastnode!=head);
				
				if(position==1)
				{
					Node current=head;
					head=head.next;
					current.next=null;
					tail.next=head;
					count--;
					return;
					
				}
				
				if(position==count)
				{
					Node current=head;
					while(current.next)
				}
		}

}
