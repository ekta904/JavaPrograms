package polymorphism;

public class B extends A{
	
	public void fun() {
		System.out.println("B's Fun Method");
	}


	public static void main(String[] args) {
       
		A a= new A();//this is run time polymorphism 
		
		a.fun();// as both A and B class have same methods A's object will call the A's Fun
		B b = new B();
		a.fun();// and B's object will call B's Fun Method. 
		// you can not call A's overridden method with B's object.
	
	}

}
