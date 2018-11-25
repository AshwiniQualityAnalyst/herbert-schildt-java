package PackagesAndInterfaces;

class Balance
{
	String name ;
	double bal ;
	Balance(String n , double b)
	{
		name = n ;
		bal = b;
	}
	void show()
	{
		if(bal<0)
			System.out.println("--> ");
		System.out.println(name + ": $" + bal);
	}
}
public class AccountBalance 
{
	public static void main(String[] args) 
	{
		Balance current[] = new Balance[3];
		current[0]=new Balance("Ashwini Sharma", 123.23);
		current[1]=new Balance("Nisha", 129);
		current[2]=new Balance("Hani", -123.23);
		for (int i=0 ; i<3 ; i++)
		{
			current[i].show();
		}
	}
}
