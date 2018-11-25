package InheritancePractice;

class BBBox
{
	private double width ;
	private double height ;
	private double depth ;
	BBBox(BBBox ob)
	{
		width = ob.width ;
		height = ob.height ;
		depth = ob.depth ;
	}
	BBBox(double w , double h , double d)
	{
		width = w ;
		height = h ;
		depth = d ;	
	}
	BBBox()
	{
		width = -1 ;
		height = -1 ;
		depth = -1 ;
	}
	BBBox(double length)
	{
		width = height = depth = length ;
	}
	double volume()
	{
		return width * height * depth ;
	}
}
class BBBoxWeight extends BBBox
{
	double weight ;
	BBBoxWeight(BBBoxWeight ob)
	{
		super(ob);
		weight = ob.weight ;
	}
	BBBoxWeight(double w , double h , double d , double m) 
	{
		super(w, h, d);
		weight = m ;
	}
	BBBoxWeight()
	{
		super();
		weight = -1 ;
	}
	BBBoxWeight(double length , double m)
	{
		super(length);
		weight = m ;
	}
}
class Shipment extends BBBoxWeight
{
	double cost ;
	Shipment(Shipment ob)
	{
		super(ob);
		cost = ob.cost;
	}
	Shipment(double w , double h , double d , double m , double c)
	{
		super(w, h, d, m) ;
		cost = c ;
	}
	Shipment()
	{
		super();
		cost = - 1 ;
	}
	Shipment(double length , double m , double c)
	{
		super(length, m);
		cost = c ;
	}
}
public class MultiLevelInheritance 
{
	public static void main(String[] args) 
	{
		Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41) ;
		Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28) ;
		double vol ;

		vol = shipment1.volume() ;
		System.out.println("Volume of Shipment1 : " + vol);
		System.out.println("Weight of Shipment1 : " + shipment1.weight);
		System.out.println("Shipping Cost : $" + shipment1.cost);
		System.out.println();
		vol = shipment2.volume() ;
		System.out.println("Volume of Shipment2 : " + vol);
		System.out.println("Weight of Shipment2 : " + shipment2.weight);
		System.out.println("Shipping Cost : $" + shipment2.cost);
		System.out.println();
	}
}
