package wrapperclass;

public class WrapperClass 
{
   public static void main(String[] args) 
   {
	   int i=10;
	   Integer x= new Integer(i); //boxing
	   System.out.println("x "+ x);
	   Integer z=Integer.valueOf(i);
	   
	   Integer y=i; //auto-boxing
	   System.out.println("y "+ y);
	   
	   
	int a=y.intValue(); // unboxing
	Boolean flag=true;
	boolean b=flag.booleanValue(); //unboxing
	System.out.println("a "+ a +"b "+b);
	
	Integer m=10;
	Integer j=10;
	
	if(m==j)
		System.out.println("true");
}
   
}
