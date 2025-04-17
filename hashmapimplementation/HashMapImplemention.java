package hashmapimplementation;

public class HashMapImplemention 
{
   Entry buckets[]=new Entry[16];
   int size=16;
   
   public int getbucketindex(int key)
   {
	   return Math.abs(Integer.hashCode(key))%size;
   }
   
   
   public void put(int key, int value)
   {
	   Entry node= new Entry(key,value);
	   for(int i=0; i<size; i++)
	   {
	      
	  
	   }
	   
   }
}
