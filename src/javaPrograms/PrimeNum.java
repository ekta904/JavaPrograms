package javaPrograms;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
              
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter a number ");
		int num = sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0) {
              count++;
              break;
              }
		}
		if(count==0) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		
	}

}
