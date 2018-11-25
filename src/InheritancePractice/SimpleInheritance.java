package InheritancePractice;

class Parent
{
	int i , j ;
	void showij()
	{
		System.out.println("i & j: " + i + " " + j);
	}
}

class Child extends Parent
{
	int k ;
	void showk()
	{
		System.out.println("K: " + k);
	}
	void sum()
	{
		System.out.println("i + j + k: " + (i + j + k ));
	}
}

public class SimpleInheritance 
{
	public static void main(String[] args) 
	{
		Parent p = new Parent();
		Child c= new Child();
		p.i = 10 ;
		p.j = 20 ;
		p.showij();
		c.i = 1 ;
		c.j = 2 ;
		c.k = 3 ;
		c.showij();
		c.k = 4 ;
		c.showk();
		c.sum();
	}
}
