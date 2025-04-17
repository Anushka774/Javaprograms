package stackusingarrays;
import java.util.*;
public class Driver 
{
   public static void main(String[] args)
    {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter size of array");
	   int size=sc.nextInt();
	   Stack st=new Stack(size);
	   st.push();
	   st.peek();
	   st.pop();
    }
}
