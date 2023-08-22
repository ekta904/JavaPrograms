package polymorphism;

public class CompileTime {

	public static void main(String[] args) {

		CompileTime ct=new CompileTime();
		ct.addition();             
		ct.addition(20, 50);
		ct.addition(30, 34.3f);
		ct.addition(10, 20, 30);
	}
	// all the below methods have same name but different 
	//parameters this is called method Overloading.
	
	
	public void addition()

	{
		int a=10;
		int b=20;
		int sum= a+b;
		System.out.println(sum);
	}
	public void addition(int a, int b) {
		int sum= a+b;
		System.out.println(sum);
	}
	public void addition(int a, float b) {
		float sum= a+b;
		System.out.println(sum);
	}
	public void addition(int a, int b,int c) {
		int sum= a+b+c;
		System.out.println(sum);
	}
}
