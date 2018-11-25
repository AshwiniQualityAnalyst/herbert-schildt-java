package InheritancePractice;

class Ashwini
{
	int i , j ;
	Ashwini(int a , int b)
	{
		i = a ;
		j = b ;
	}
	void show()
	{
		System.out.println("i & j : " + i + " , " + j) ;
	}
}
class Nisha extends Ashwini
{
	int k ;
	Nisha(int a , int b , int c)
	{
		super(a, b) ;
		k = c ;
	}
	//Override Show
	void show()
	{
		super.show();
		System.out.println("K : " + k);
	}
}
public class MethodOverride 
{
	public static void main(String[] args) 
	{
		Nisha N1 = new Nisha(1, 2, 3);
		//Ashwini A1 = new Ashwini(4, 5);
		N1.show();
		//A1.show();
	}
}
