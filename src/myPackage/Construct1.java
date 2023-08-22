package myPackage;

public class Construct1 {

	int code;
	String city;
	char gender;
	
	public static void main(String[] args) {

        Construct1 c= new Construct1();
        c.cityname();
        
	Construct1 c1= new Construct1("Nagpur",'M', 411015);
	c1.cityname();
	}
	
	public Construct1()
	{
		city="Pune";
		gender='F';
		code=1234;
	}
	
	public Construct1(String a,char b, int c) {
		
		city=a;
		gender=b;
		code=c;
	}
	
	public void cityname() {
		
		System.out.println("City Name is "+city);
		System.out.println("Gender is "+gender);
		System.out.println("code is "+code);

	}
}
