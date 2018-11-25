package InheritancePractice;

class Boxx
{
	private double width ;
	private double height ;
	private double depth ;
	Boxx(Boxx ob)
	{
		width = ob.width;
		height =ob.height;
		depth = ob.depth;
	}
	Boxx(double w , double h , double d)
	{
		width = w ;
		height = h ;
		depth = d ;
	}
	Boxx()
	{
		width = -1;
		height = -1 ;
		depth = -1;
	}
	Boxx(double length)
	{
		width = height = depth = length ;
	}
	double volume()
	{
		return width * height * depth ;
	}
}
class Boxweight1 extends Boxx
{
	double weight ;
	Boxweight1(Boxweight1 ob) 
	{
		super(ob);
		weight = ob.weight;
	}
	Boxweight1(double w , double h , double d , double m)
	{
		super(w, h, d);
		weight = m ;
	}
	Boxweight1() 
	{
		super();
		weight = -1;
	}
	Boxweight1(double length , double m)
	{
		super(length);
		weight = m;
	}
}
public class DemoSuper 
{
	public static void main(String[] args) 
	{
		Boxweight1 mybox1 = new Boxweight1(10, 20, 15, 34.3);
		Boxweight1 mybox2 = new Boxweight1();
		Boxweight1 mycube = new Boxweight1(3, 2);
		Boxweight1 myclone = new Boxweight1(mybox1);
		double vol ;
		vol = mybox1.volume();
		System.out.println(vol);
		System.out.println(mybox1.weight);
		System.out.println("");
		
		vol = mybox2.volume();
		System.out.println(vol);
		System.out.println(mybox2.weight);
		System.out.println("");
		
		vol = mycube.volume();
		System.out.println(vol);
		System.out.println(mycube.weight);
		System.out.println("");
		
		vol = myclone.volume();
		System.out.println(vol);
		System.out.println(myclone.weight);
		
		
		
		
		
		
		
		
	}
}
