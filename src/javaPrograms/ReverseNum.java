package javaPrograms;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a number ");
		int num = sc.nextInt();
		int revNum=0;
		// calculations shown for 1234
		for(int i=num; i>0;i=i/10)//1234,123,12,1
		{
			int remainder=i%10;
			revNum=revNum*10+remainder;
			
			//revNum=0+4=4
			//4*10+3=43
			//43*10+2=432
			//432*10+1=4321
		}

		System.out.println("Reverse Number is "+revNum);
	}

}
