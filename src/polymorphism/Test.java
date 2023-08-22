package polymorphism;

public class Test {

	public static void main(String[] args) {
           
//		SBI s=new SBI();
//		ICICI c= new ICICI();
//		AXIS a=new AXIS();
//		System.out.println("SBI Rate of Interest is "+SBI.getRateofInterest()+"%");
//		System.out.println("ICICI Rate of Interest is "+ICICI.getRateofInterest()+"%");
//		System.out.println("SBI Rate of Interest is "+AXIS.getRateofInterest()+"%");
//		
		
        String name="Atul Khandekar";
        int a=name.indexOf('k');
        int b= name.indexOf('A');
        int c=name.indexOf('K');
        System.out.println("Index of k "+a);
        System.out.println("Index of A "+b);
        System.out.println("Index of K "+c);

 
	}
	public static void main() {
		System.out.println("In Second Main");
	}
	
	public void main(String a) {
		System.out.println("In Third Main");
	}
	
	
	

}
