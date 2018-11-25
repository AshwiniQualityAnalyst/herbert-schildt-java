package InheritancePractice;

class BBox
{
	double width ;
	double height ;
	double depth ;
	//Construct clone of an Object
	BBox(Box ob)  //Pass Object to Constructor
	{
		width = ob.width ;
		height = ob.height ;
		depth = ob.depth ;
	}
	//Constructor used when all Dimension specified
	BBox(double w , double h , double d)
	{
		width = w ;
		height = h ;
		depth = d ;
	}
	//Constructor used when no Dimension specified 
	BBox()
	{
		width = -1 ;
		height = -1 ;
		depth = -1 ;
	}
	//Constructor used when cube is created
	BBox(double length)
	{
		width = height = depth = length ;
	}
	//Compute & return Volume
	double volume()
	{
		return width * height * depth;
	}
}

class BBoxWeight extends Box
{
	double Weight ;
	//Constructor for BoxWeight
	BBoxWeight(double w , double h , double d , double We )
	{
		width = w ;
		height = h ;
		depth = d ;
		Weight = We ;
	}
}
public class RefDemo
{
	public static void main(String[] args)
	{
		BBoxWeight weightbox = new BBoxWeight(1, 2, 3, 4);
		BBox plainbox = new BBox();
		double vol ;
		vol = weightbox.volume();
		System.out.println("Volume Of Weightbox is : " + vol);
		System.out.println("Weight Of Weightbox is : " + weightbox.Weight);
		System.out.println();
		//Assign BBoxWeight reference to Box reference

		////////Main line---Uncomment the below line
		//plainbox = weightbox  ;
		//convert from BBoxWeight to BBox
		vol = plainbox.volume();
		System.out.println("Volume of plainbox is : " + vol);
		//Invalid below Statement
		//System.out.println("Weight of Plainbox is : " + plainbox.Weight);


	}
}
