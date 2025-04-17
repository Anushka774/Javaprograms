package fact;

public class Prime {
	public static void main(String[] args) {
		int num=37;
		int count=0;
		for(int i=1; i<num/2; i++)
		{
			if(num%i==0)
				count=count+1;
		}
		
		
		if(count==1)
			System.out.println("number is prime");
		else
			System.out.println("number is non prime");
	}

}
