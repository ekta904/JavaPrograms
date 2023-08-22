package Practice;

public class Continue1 {
	
	
	{
		System.out.println("Init Block");
	}
	
	
	{
		System.out.println("Init 2");
	}
	public Continue1()//constructor
	{     //this();
	
		System.out.println("Hi");
	}
	
	Continue1(int a)
	{
		this();
	}
	
	
	public static void main(String[] args) {
		
		Continue1 c= new Continue1(10);
		 for (int i = 0; i < 10; i++) {
	            // If the number is even
	            // skip and continue
	            if (i % 2 == 0)
	                continue;
	 
	            // If number is odd, print it
	            System.out.print(i + " ");
	        }
	}

}
