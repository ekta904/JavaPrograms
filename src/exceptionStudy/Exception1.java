package exceptionStudy;

import java.io.FileInputStream;

public class Exception1 {

	public static void main(String[] args) throws Exception {

          int a=0;
          int b=20;
          int c;
          try {
          c=b/a;
          System.out.println(c);
          }
          catch(ArithmeticException  e)
          {
        	  System.out.println("Cant divide by zero");
          }
          
          System.out.println("Hi All");
          Thread.sleep(1000);
          System.out.println("Hi");
          //FileInputStream fis = new FileInputStream(null)
	}

}
