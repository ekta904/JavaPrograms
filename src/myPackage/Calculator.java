package myPackage;

public class Calculator {

	public static void main(String[] args) {
       Calculator cal=new Calculator();
       cal.add(123, 345);
       cal.sub(343, 222);
       cal.mul(34, 55);
       cal.div(30, 5);
       cal.remainder(43, 4);
       cal.percentage(510, 550);
      
       }
	
	public void add(int a, int b) {
		
		int c;
		c= a+b;
		System.out.println(c);
	}

    public void sub(int a, int b) {
		
		int c;
		c= a-b;
		System.out.println(c);
	}
    
     public void mul(int a, int b) {
		
		int c;
		c= a*b;
		System.out.println(c);
	}
     public void div(int a, int b) {
 		
 		int c;
 		c= a/b;
 		System.out.println(c);
 	}
     public void remainder(int a, int b) {
  		
  		int c;
  		c= a%b;
  		System.out.println(c);
  	}
     public void percentage(float a, float b) {
   		
   		float c;
   		 c= (a/b)* 100;
   		System.out.println(c);
   	}
}
