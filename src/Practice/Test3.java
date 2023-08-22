package Practice;

public class Test3 {

	
	int x=11;
	
	public static void main(String[] args) {
		
		int String =10; // it is doable but not recommended

        //System.out.println(x);// can not be done in this way need to create the object of the class
	}
	public void m1()

	{
		System.out.println(x);//non static block so instance variable x can be accessed without creating the object of the class
		
	}
	
	public static void m2()
	{
		//System.out.println(x);// cannt be accessed inside the static block
		
		Test3 t= new Test3();
		System.out.println(t.x);
	}
}
