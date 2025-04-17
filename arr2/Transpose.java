package arr2;
import java.util.*;
public class Transpose 
{
	public static void main(String[] args) 
	{
		
		 rotateninety(acceptarray());
	}
			
			
	
	        public static int[][] acceptarray()
			{
				 int size;
				 System.out.println("Enter size of the 2D array");
				 Scanner sc=new Scanner(System.in);
				 size=sc.nextInt();
				
				
				 int[][] arr= new int[size][size];
			
				 System.out.println("Enter elements in 2D array");
				  
				 for(int i=0; i<arr.length; i++)
				 {
					 for(int j=0; j<arr[i].length; j++)
					 {
						arr[i][j]=sc.nextInt();
					 }
				 }
				 
				 System.out.println("Original array");
				   for(int i=0; i<size; i++)
					{
						for(int j=0; j<size; j++)
						{
							System.out.print(arr[i][j]+" ");
						}
						
						 System.out.println();
					}
				
				   return arr;
			}
			
	
	
	        public static void rotateninety(int arr2[][])
	      {
	        	
	        	 System.out.println();
	        	 System.out.println("Rotated 90 degree array");
	        	 
	        	 
	        	 
	        	 
		    for(int i=0; i<arr2.length; i++)
		    {
		     	for(int j=0; j<arr2[i].length; j++)
		    	{
				   arr2[i][j]=arr2[j][i];
			    }
			
		     }
		    
		    for(int i=arr2.length-1; i>=0; i--)
			{
				for(int j=arr2.length-1; j>=0; j--)
				{
					System.out.print(arr2[i][j]+" ");
				}
				
				System.out.println();
			}
	      }
	
			
			

}
