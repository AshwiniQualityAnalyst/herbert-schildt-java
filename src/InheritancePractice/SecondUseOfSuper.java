package InheritancePractice;

class AA
{
	int i ;
}
class BB extends AA
{
	int i ;

	BB(int a , int b)
	{
		super.i = a ;  // i in AA
		i = b;        //  i in BB
	}

	void show()
	{
		System.out.println("i in superclass :" + super.i );
		System.out.println("i in sub class " + i);
	}
}

public class SecondUseOfSuper 
{
	public static void main(String[] args) 
	{
		BB subOb = new BB(2, 3);
		subOb.show();
	}

}
