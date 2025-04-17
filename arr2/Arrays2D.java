package arr2;
import java.util.*;
public class Arrays2D 
{
	public static void main(String[] args)
	{
		int[][] arr= new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements in 2D array");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
