package newPractice;

public class Variables {

	int x;
	public static int y;

	public static void main(String[] args) {
		int b=0;
		Variables v=new Variables();
		v.x=10;
		System.out.println(v.x);
		System.out.println(y);
		v.m1();
		System.out.println(b);// can't use it without initializing
		y=2;
		

	}
	public  void m1() {
		y=3;
		
		System.out.println(x);
	}




}
