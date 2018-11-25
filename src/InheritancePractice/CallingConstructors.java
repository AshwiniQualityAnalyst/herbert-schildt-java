package InheritancePractice;

class AAA
{
	AAA()
	{
		System.out.println("Inside AAA's Constructor");
	}
}
class BBB extends AAA
{
	BBB()
	{
		System.out.println("Inside BBB's Constructor");
	}
}
class CCC extends BBB
{
	CCC()
	{
		System.out.println("Inside CCC's Constructor");
	}
}

public class CallingConstructors 
{
	public static void main(String[] args) 
	{
		CCC c = new CCC();
		
	}
}
