package acces_modifiers;

public class Child extends Parent
{
	public void validate()
	{
		System.out.println(Parent.a);
		Parent.print();
	}

}
