package StringHandling359;

//versus==
public class EqualsAndEqualsIgnoreCaseAndVersus
{

	public static void main(String[] args)
	{
		String s1 = "Hello" ;
		String s2 = "Hello" ;
		String s3 = "Good-bye" ;
		String s4 = "HELLO" ;
		String s5 = new String(s4) ;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s4);
		System.out.println(s5);
		System.out.println("Now Check s4 == s5");
		System.out.println(s4 == s5);
		
		
		
	}

}
