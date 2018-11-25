package StringHandling359;

class Box
{
	double width ;
	double height ;
	double depth ;

	Box(double w , double h , double d)
	{
		width = w ;
		height = h ;
		depth = d ;
	}

	public String toString()
	{
		return "Dimemsions are " + width + " By " + depth + " By " + height + " . " ;
	}
}

public class StringConversionAndtoString 
{
	public static void main(String[] args) 
	{
		Box b = new Box(10, 12, 14);
		
		String s = "Box b: " + b ;
		System.out.println(b);
		System.out.println(s);
	}
	

}
