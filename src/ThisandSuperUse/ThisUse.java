package ThisandSuperUse;

public class ThisUse {

	
	int a=20;
	static int b=30;
	
	public static void main(String[] args) {
 
		
		ThisUse tu=new ThisUse();
		tu.addition();
		
	}
	
	public void addition()
	{
		int a=10, b=40, sum;
		sum=a+b;
		System.out.println("The local value of a is  "+a);
		System.out.println("Addition using the lical value  "+sum);
		System.out.println("Addition using the Global values "+(a+b));
		System.out.println("The global value of a "+this.a);
	    System.out.println("The Global value of b  "+b);
	}
	
	
}
