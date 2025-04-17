package arr2;
import java.util.*;

public class Jaggedarray
{
  public static void main(String[] args)
  {
	jaggedarray();
  }
  
  
  public static void jaggedarray()
  {
	  int rows, columns;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number of rows");
	  rows=sc.nextInt();
	  int[][] arr=new int[rows][];
	
	  for(int i=0; i<rows; i++)
	  {
		  System.out.println("Enter column for "+ i +"th row" );
		  columns=sc.nextInt();
		  arr[i]=new int[columns];
		  System.out.println("Enter column values");
		  for(int j=0; j<columns; j++)
		  {
			  arr[i][j]=sc.nextInt();
		  }
	  }
	  
	  
	  for(int i=0; i<arr.length; i++)
	  {
		  for(int j=0; j<arr[i].length; i++)
			  System.out.println(arr[i][j]);
	  }
  }
  
  
}

