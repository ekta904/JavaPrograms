package stringUse;

public class BufferandBuilder2 {

	public static void main(String[] args) 
	{
		
		String s1="Geeks";
		concat1(s1);
		System.out.println(s1);//Concat1: In this method, we pass a string “Geeks” 
		//and perform “s1 = s1 + ”forgeeks”. The string passed from main()
		//is not changed, this is due to the fact that String is immutable. 
		//Altering the value of string creates another object and s1 in concat1()
		//stores reference of the new string. References s1 in main() and cocat1() 
		//refer to different strings.
		
		StringBuffer s2=new StringBuffer("Geeks");
		concat2(s2);
		System.out.println(s2);//Concat2: In this method, we pass a string “Geeks” 
		//and perform “s2.append(“forgeeks”)” which changes the actual value 
		//of the string (in main) to “Geeksforgeeks”. This is due to the simple 
		//fact that StringBuilder is mutable and hence changes its value
		
		StringBuilder s3=new StringBuilder("Geeks");
		concat3(s3);
		System.out.println(s3);//Concat3: StringBuilder is similar and can be compatible
		//at all places to StringBuffer except for the key difference of thread safety. 
		//StringBuffer is thread-safe while StringBuilder does not guarantee 
		//thread safety which means synchronized methods are present in 
		//StringBuffer making control of one thread access at a time while 
		//it is not seen in StringBuilder, hence thread-unsafe.
		
		
		

	}
	
	public static void concat1(String s1)
	{
		s1=s1+" forGeeks";
	}
	
	public static void concat2(StringBuffer s2)
	{
		s2.append("forGeeks");
	}
	public static void concat3(StringBuilder s3)
	{
		s3.append("forGeeks");
	}


}
