package PackagesAndInterfaces;

interface AB
{
	void Meth1() ;
	void Meth2() ;
}

interface CD extends AB
{
	void Meth3() ;
}

class Myclass implements CD
{

	@Override
	public void Meth1()
	{
		System.out.println("Ashwini");
	}
	@Override
	public void Meth2()
	{
		System.out.println("Kumar");
	}
	public void Meth3() 
	{
		System.out.println("Sharma");
	}
}

public class ExtendInterface 
{
	public static void main(String[] args) 
	{
		Myclass Object = new Myclass() ;
		Object.Meth1();
		Object.Meth2();
		Object.Meth3();
	}

}
