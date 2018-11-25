package PackagesAndInterfaces;

class A
{
	interface NestedIf
	{
		boolean isNotNegative(int x);
	}
}
class B implements A.NestedIf
{
	@Override
	public boolean isNotNegative(int x) 
	{
		return x < 0 ? false : true ;
	}
}
public class NestedInterfaceWithNestedIf 
{
	public static void main(String[] args) 
	{
		A.NestedIf nif = new B();
		if(nif.isNotNegative(10))
		{
			System.out.println("10 is not Negative");
		}
		if(nif.isNotNegative(-12))
		{
			System.out.println("This won't be displayed");
		}

	}
}
