package javaPrograms;

public class Fibonicci2 {

	public static void main(String[] args) {
      
		int n1=0;
		int n2=1;
		//int n3=0;
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<=10;i++) {
		n1=n1+n2;
		System.out.print(n1+" ");
		n1=n2+n1;
		n2=n1-n2;
		n1=n1-n2;
		
	}
	}}
