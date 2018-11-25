package PackagesAndInterfaces;

interface IntegerStack
{
	void push(int item) ;
	int pop() ;
}
class StackFixed implements IntegerStack
{
	private int stck[] ;
	private int TOS ;
	StackFixed(int size)
	{
		stck = new int[size] ;
		TOS = -1 ;
	}

	public void push(int item) 
	{
		if (TOS == stck.length-1)
		{
			System.out.println("Stack is Full");
		}
		else
		{
			stck[++TOS] = item ;
		}
	}

	public int pop() 
	{
		if (TOS < 0)
		{
			System.out.println("Stack Underflow");
			return 0 ;
		}
		else
		{
			return stck[TOS--] ;
		}
	}
}
public class PushPopStack 
{
	public static void main(String[] args) 
	{
		StackFixed MyStack = new StackFixed(5);
		for (int i = 0 ; i < 5 ; i++)
			MyStack.push(i);
		System.out.println("Contents of MyStack");
		for (int i = 0 ; i < 5 ; i++)
			System.out.println(MyStack.pop());
	}
}
