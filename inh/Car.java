package inh;

  class Car extends Vehicle 
{
  int hp;
  public Car(String name, String engType, int hp)
  {
	  super(name,engType);
	  this.hp=hp;
	  System.out.println("Child");
  }
}
