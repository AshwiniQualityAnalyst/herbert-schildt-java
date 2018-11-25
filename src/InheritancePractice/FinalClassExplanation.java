//Genuine Issue----Final modifier

package InheritancePractice;

class ABC
{
  //final void meth()
	
	final void meth()
	{
		System.out.println("This is Final Method");
	}
}

class DEF extends ABC
{
	
	void meth()
	{
		System.out.println("Illegal");
	}

}


