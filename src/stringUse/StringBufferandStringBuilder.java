package stringUse;

public class StringBufferandStringBuilder {

	public static void main(String[] args) {

		System.out.println(buf());

		System.out.println(build());

	}
	
	public static StringBuffer buf() 
	{

		StringBuffer buffer= new StringBuffer("Hello");
		buffer.append(" Java");
		return buffer;
	}
	
	public static StringBuilder build()
	{
		StringBuilder builder= new StringBuilder("Hi");
		builder.append(" Ekta");
		return builder;
	}

}
