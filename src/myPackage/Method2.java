package myPackage;

public class Method2 {

	public static void main(String[] args) {
		Method2 m=new Method2();
		m.add(4, 8);
		m.sub(12, 3);
		mul(987888,8987);
	}

	public void add(int a, int b)
	{
		int sum;
		sum=a+b;
		System.out.println("Sum is  "+sum);
		
	}
	
	public void sub(int x,int y)
	{
		int substraction;
		substraction= x-y;
		System.out.println("Substraction is  "+substraction);
	}
	
	public static void mul(int a, int b) {
		long mul=(long)a*b;
		//mul= a*b;
		System.out.println("Multiplication is "+mul);
		
	}
}
