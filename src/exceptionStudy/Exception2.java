package exceptionStudy;

public class Exception2 {

	public static void main(String[] args) {

       String s="Velocity";
       
       try {
    	   System.out.println(s.charAt(9));
       }
       catch(StringIndexOutOfBoundsException e)
       {
    	   System.out.println(e.getMessage());
       }
       finally {
		System.out.println("Hi Ekta");
	}
	}

}
