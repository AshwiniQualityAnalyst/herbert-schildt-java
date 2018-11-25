package InheritancePractice;

abstract class figuree
{
	double dim1 ;
	double dim2 ; 
	figuree(double a , double b)
	{
		dim1 = a ;
		dim2 = b ;
	}

	abstract double area() ;
}
class rectanglee extends figuree
{
	rectanglee(double a , double b)
	{
		super(a, b);
	}

	@Override
	double area() 
	{
		System.out.println("Inside area of rectangle");
		return dim1 * dim2 ;
	}
}
class trianglee extends figuree
{
	trianglee(double a , double b)
	{
		super(a, b);
	}

	@Override
	double area() 
	{
		System.out.println("Inside area of rectangle");
		return dim1 * dim2 / 2 ;
	}
}
public class AbstractClassAreas 
{
	public static void main(String[] args) 
	{
		rectanglee Re = new rectanglee(10, 10);
		trianglee Tr = new trianglee(10, 8);
		figuree ref ;
		
		ref = Re ;
		System.out.println("Area is : " + ref.area());
		
		ref = Tr ;
		System.out.println("Area is : " + ref.area());
	}
}
