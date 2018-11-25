package ControlStatements;

public class WhileNoBody 
{
	public static void main(String[] args) 
	{
		int i , j ;
		i=5;
		j=10;

		while(++i < --j)
			//6 < 9
			//7 < 8
			// 8 < 7
			System.out.println("Midpoint is " + i);
	}
}
