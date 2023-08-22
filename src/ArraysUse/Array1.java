package ArraysUse;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {

      String name[]=new String[5];
      
      name[0]="Anaya";
      name[1]="Avanish";
      name[2]="Atul";
      name[3]="Ekta";
      name[4]="Khandekar";
      for(int i=0;i<name.length;i++) {
    	  System.out.println(name[i]);
      }
    	
      System.out.println("====================================");
      
      Array1 a=new Array1();
      a.method1();
      
      StringBuffer sf= new StringBuffer();                                                                             
      
	}
	
	public void method1(){
		
	int x[]=new int[5];
	x[0]=33;
	x[1]=23;
	x[2]=55;
	x[3]=65;
	x[4]=11;
	Arrays.sort(x);
	for(int i=0;i<x.length;i++)
	{
		System.out.println(x[i]);
	}

	}

}
