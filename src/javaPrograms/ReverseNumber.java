package javaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Number to be reversed ");
		int num = sc.nextInt();

		String numstr = Integer.toString(num);
		String revnumStr="";

		for(int i=numstr.length()-1;i>=0;i--) {

			revnumStr=revnumStr+numstr.charAt(i);

		}

		int revNum = Integer.parseInt(revnumStr);

		System.out.println("Reverse Number is "+revNum);
		
		if (revNum==num) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}

}
