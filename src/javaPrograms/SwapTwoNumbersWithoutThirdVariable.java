package javaPrograms;

import java.util.Scanner;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        x=x+y;//x+y
        y=x-y;//x+y-y=x 
        x=x-y;//(x+y)-(x+y-y)=y
        
        System.out.println("Numbers after Swapping \nx "+x+"\ny "+y);
	}

}
