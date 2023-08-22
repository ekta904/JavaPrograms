package javaPrograms;

import java.util.Scanner;

public class ArmStrongeNumber {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=num;i>0;i=i/10) 
		{ 
			count++; 
		}
		System.out.println(count);
		int remainder=0;

		for(int i=num;i>0;i=i/10) 
		{
			remainder=i%10;
			sum=(int) (sum+Math.pow(remainder, count));
		}
		if(sum==num)
		{
			System.out.println("The given number is ArmStronge Number");
		}
		else
		{
			System.out.println("Number is not armstronge");
		}
	}

}
