package Inheritance;

public class Father{

	
	Father(){
       // this();// not possible
		System.out.println("Constructor of Father");
	}
	 static void money()
	{
		System.out.println("Fathers Money");
	}

	public static void home()
	{
		System.out.println("Fathers Home");
	}
	public static void main(String[] args) {
		
		//Father f =new Son();
		Father.money();
		Son.money();
		
		System.out.println("Main of Father");
	}
}

