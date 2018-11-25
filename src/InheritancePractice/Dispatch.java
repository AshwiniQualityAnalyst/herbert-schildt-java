package InheritancePractice;

class E
{
	void callme()
	{
		System.out.println("Inside E's Callme method");
	}
}
class F extends E
{
	void callme()
	{
		System.out.println("Inside F's Callme method");
	}
}
class G extends E
{
	void callme()
	{
		System.out.println("Inside G's Callme method");
	}
}
public class Dispatch 
{

	public static void main(String[] args) 
	{
		E e = new E();
		F f = new F();
		G g = new G();
		E ref ;
		
		ref = e ;
		ref.callme();
		
		ref = f ;
		ref.callme();
		
		ref = g ;
		ref.callme();
	}

}
