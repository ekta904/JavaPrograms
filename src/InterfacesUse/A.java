package InterfacesUse;

import Interfaces.B;

public class A implements B{

	final int x=20;
	public static void main(String[] args) {
		int x=10;
		//original value of a is 10
		System.out.println(x);
		x=x+20;//(reassignment)modified value is 30
		System.out.println(x);//modification in the value is allowed
		A a=new A();
		System.out.println(a.x);
		
		
		//final int b=50;//value of final variable can't be reassigned 
		//value remains same through the lifetime.
		//b=b+50; // cant do this
	}
	public void demo()

	{
		System.out.println("This is the demo class");
	}
	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}
}
