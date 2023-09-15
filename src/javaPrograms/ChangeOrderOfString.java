package javaPrograms;

public class ChangeOrderOfString {

	public static void main(String[] args) {

		String s= "This is new string";
		String ar[]=s.split(" ");
		System.out.println("Here the odd positions of the given string are reversed");
		for(int i=0;i<=ar.length-1;i++) //for odd positions
		{

			if(i%2==0) {
				ar[i]=revString(ar[i]);			
			}
		}

		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("===================================");

		String s1= "This is new string";
		 String[] ar1 = s.split(" ");
		System.out.println("Here the Even positions of the given string are reversed");

		for(int i=0;i<=ar1.length-1;i++) //for Even positions
		{

			if(i%2!=0) {
				ar1[i]=revString(ar1[i]);			
			}
		}
		for(int i=0;i<=ar1.length-1;i++)
		{
			System.out.print(ar1[i]+" ");
		}
	}

	public static String revString(String input) 
	{
		String revString="";
		for(int i=input.length()-1;i>=0;i--)
		{
			revString=revString+input.charAt(i);	
		}

		return revString;
	}

}
