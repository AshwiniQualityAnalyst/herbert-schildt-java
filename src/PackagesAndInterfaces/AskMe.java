package PackagesAndInterfaces;
import java.util.Random;

interface SharedConstants
{
	int No = 0;
	int Yes = 1 ;
	int Maybe = 2 ;
	int Later = 3 ;
	int Soon = 4 ;
	int Never =5 ;
}
class Questions implements SharedConstants
{
	Random rand = new Random();
	int ask()
	{
		int prob = (int) (100 * rand.nextDouble()) ;
		if(prob < 30)
			return No ;
		else if (prob < 60)
			return Yes ;
		else if (prob < 75)
			return Later ;
		else if (prob < 98)
			return Soon ;
		else 
			return Never;
	}
}
public class AskMe implements SharedConstants
{
	static void answer(int Result)
	{
		switch (Result)
		{
		case No:
			System.out.println("No");
			break;
		case Yes:
			System.out.println("Yes");
			break;
		case Maybe:
			System.out.println("Maybe");
			break;
		case Later:
			System.out.println("Later");
			break;
		case Soon:
			System.out.println("Soon");
			break;
		case Never:
			System.out.println("Never");
			break;
		}
	}
	public static void main(String[] args) 
	{
		Questions q = new Questions();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		
	}
}
