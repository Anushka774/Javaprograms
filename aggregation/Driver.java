package aggregation;

public class Driver 
{
  public static void main(String[] args) 
  {
	Sim sim=new Sim(1234567);
	Phone p=new Phone("Samsung", sim);
	p.display();
  }
}
