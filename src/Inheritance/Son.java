package Inheritance;

public class Son extends Father {
	
	Son()
	{   //this();
		super();
		
		System.out.println("Constructor of Son");
		
	}
	static void money()
	{
		System.out.println("Sons Money");
	}

	public void laptop()
	{

		System.out.println("Sons Laptop");
	}

	public static void bike()	
	{

		System.out.println("Sons Bike");
	}
	public static void main(String[] args) {
		Father.money();
		Son.money();
		//this();
		
	}
}
