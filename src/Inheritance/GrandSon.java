package Inheritance;

public abstract class GrandSon extends Son
{

	GrandSon()
	{    
		//super();

		System.out.println("Constructor of GrandSon");
	}

	public void SchoolBag()
	{
		System.out.println("Grandsons SchoolBag");
	}

	public static void Toys()
	{
		System.out.println("Gransons Toys");
	}

	public abstract void test1();
	
	public static void main(String[] args) {
		
		
	}
}
