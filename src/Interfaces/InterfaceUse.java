package Interfaces;

public class InterfaceUse implements A,B{

	public static void main(String[] args) {
         
		InterfaceUse iu=new InterfaceUse();
		iu.test();//abstract methods of A
		iu.test1();
		System.out.println(a);//no need call with instance variable as its static.
		iu.test3(); //abstract methods of B
		System.out.println(s);
		iu.test2();
		A.test3();
		B.test5();
		A.test3();
		
	}

	@Override
	public void test() {
		System.out.println("Test method declared in interface A and defined in this class");		
	}

	@Override
	public void test1() {
		System.out.println("Test1 method declared in interface A and defined in this class ");
	}

	@Override
	public void test3() {
		System.out.println("Test3 method declared in interface B and defined in this class ");
		
	}

}
