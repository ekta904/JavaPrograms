package Practice;

public class Demo {
	final int x=11;

	static int s=55;
	int t=10;
	public static void main(String[] args) {
		Demo d=new Demo();
//		final int y;
//		y=10;
//		System.out.println(y);
//		System.out.println(d.x);
//		System.out.println(s);

		
		d.t=30;
		d.s=100;
		
		Demo d1=new Demo();
		System.out.println(d1.t+"  "+d1.s);
//      for(int i=0;i>5;i++) {
//    	  System.out.println(i);
//      }
     // System.out.println(i); // this will give an error as i is limited to for loop
//	int a=5;
//	System.out.println(~a);
	
	}
	public void test()
	{
		System.out.println(s);
	}

}
