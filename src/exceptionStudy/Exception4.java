package exceptionStudy;

public class Exception4 {

	public static void main(String[] args) {
          
		 int a= 10;
		 int b=0;
		 int c=0;
		 try {
			 c=a/b;
		 }catch(ArithmeticException e) {
			 System.out.println("This is arithmatic Exception");
			 
		 }catch(NullPointerException e) {
			 System.out.println("This is Null Pointer Exception");
			 
		 }catch(Exception e) {
			 System.out.println("It is Only Exception");
		 }// we can write multiple catch  blocks but if you are writing the Exception e in the first catch block then other 
		 //catch blocks will show the errors.
		 //we cant write the multiple try blocks.
		 
		 finally {
			System.out.println("This will execute finally");// there can be only one finally block.
		}
	}

}
