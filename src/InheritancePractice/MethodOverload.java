package InheritancePractice;

class Dad
{
	int i , j ;
	Dad(int a , int b)
	{
		i = a ;
		j = b ;
	}
	void show()
	{
		System.out.println("i & j : " + i + " , " + j) ;
	}
}
class Mom extends Dad
{
	int k ;
	Mom(int a , int b , int c)
	{
		super(a, b);
		k = c ;
	}
	//Overload Show
	void show(String Message)
	{
		System.out.println(Message + k);
	}
}
public class MethodOverload 
{
	public static void main(String[] args) 
	{
		Mom M = new Mom(1, 2, 3) ;
		M.show();
		M.show("Ashwini Sexy ");
	}

}
