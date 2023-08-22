package UseOfFinal;

final public class A {
	
	public static void main(String[] args) {
		
		final int a=10;
		//a=a+10;//not allowed caz the value of final variable cant be modified
		System.out.println(a);
		int b=a+10;//this can be done.
		System.out.println(b);//value of b
		
		
	}
	final void test()
	{
		System.out.println("Inside final method test.");
	}	

}
