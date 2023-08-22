package javaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
        
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string to be reversed ");
		String s = sc.next();
		String revStr="";
		for(int i=s.length()-1; i>=0;i--) {
			
			revStr=revStr+s.charAt(i);
		}
		System.out.println("The Reverse string is "+revStr);
		
		if(revStr.equals(s)) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)=='a') {
				count++;	
			}
		}
		System.out.println("Count of cahracter \"a\" "+count);
	}

}
