package exceptionhandling;

public class ExceptionPropagation 
{
   public static void main(String[] args) 
   {
	  alpha();
   }
   
   
   public static void alpha()
	{
		System.out.println("alpha");
		beta();
	}
   
   public static void beta()
	{
		System.out.println("beta");
		gamma();
	}
   
   public static void gamma()
	{
		System.out.println("gamma");
		System.out.println(10/0);
	}
}
