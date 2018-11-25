//Creating private------------Genuine issue
package InheritancePractice;

class Parent1
{
	int i ;
	private int j ;
	void setij(int x , int y)
	{
		i = x ;
		j = y ;
	}
}
class Child1 extends Parent1
{
	int total ;
	void sum()
	{
		total = i + j ;  //Error  j is not accesible
		System.out.println(total);
	}
}
public class Access 
{
	public static void main(String[] args) 
	{
		Child1 c = new Child1();
		c.setij(10, 12);
		c.sum();

	}
}
