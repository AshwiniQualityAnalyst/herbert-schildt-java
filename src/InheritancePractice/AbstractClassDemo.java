package InheritancePractice;

abstract class H
{
	abstract void callme() ;

	abstract void callnow();

	void callmetoo()
	{
		System.out.println("This is Concrete method");
	}

	void callmelater()
	{
		System.out.println("Ashwini");
	}
}
class I extends H
{
	@Override
	void callme() 
	{
		System.out.println("I's implementation of callme. ");
	}

	@Override
	void callnow() 
	{
		System.out.println("I's implementation of callnow.");

	}
}

public class AbstractClassDemo 
{
	public static void main(String[] args) 
	{
		I i = new I() ;
		i.callme();
		i.callnow();
		i.callmetoo();
		i.callmelater();
	}

}
