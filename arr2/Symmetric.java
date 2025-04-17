package arr2;

import java.util.Scanner;

public class Symmetric
{
  public static void main(String[] args) 
  {
	
	 checksymmetric(acceptarray());
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
		
		return arr;
  }
	
	public static void checksymmetric(int arr2[][])
	{
		int count = 0;
		
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				if(arr2[i][j]!=arr2[j][i])
				{
				
					count=1;
					break;
				}
				
				
				if(count==1)
					break;
			}
			
			
			
		}
		
		if(count==0)
			System.out.println("Symmetric");
		else
			System.out.println("Not symmetric");
	}
}
