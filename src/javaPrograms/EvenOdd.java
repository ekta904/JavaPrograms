package javaPrograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

          Scanner sc= new Scanner(System.in);
          System.out.println("Enter a number please ");
          int num = sc.nextInt();
          
          if(num%2==0) {
        	 System.out.println("Given number is Even"); 
          }
          else {
        	  System.out.println("Given number is Odd");
          }
          
	}

}
