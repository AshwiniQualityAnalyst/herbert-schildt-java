package PackagesAndInterfaces;

interface IntStack
{
	void push(int item) ; //store an Item
	int pop() ;          //retrieve an Item
}

class FixedStack implements IntStack
{
	private int stck[] ;
	private int tos ;
	//allocate & initialize stack
	FixedStack(int size) 
	{
		stck = new int[size];
		tos = -1 ;
	}
	//push an item onto the stack
	public void push(int item)
	{
		if (tos == stck.length-1) //use length member
		{
			System.out.println("Stack is Full");
		}
		else
		{
			stck[++tos] = item ;
		}
	}
	//pop an item from the stack
	public int pop()
	{
		if (tos < 0)
		{
			System.out.println("Stack Underflow");
			return 0 ;
		}
		else
		{
			return stck[tos--] ;
		}
	}
}

public class IFTest 
{
	public static void main(String[] args) 
	{
		FixedStack mystack1 = new FixedStack(5);
		//Push some numbers on to Stack
		for (int i =0 ; i < 5 ; i++)
			mystack1.push(i);
		System.out.println("Stack in mystack1");
		//Pop those numbers off the stack
		for (int i =0 ; i < 5 ; i++)
			System.out.println(mystack1.pop());
	}
}
