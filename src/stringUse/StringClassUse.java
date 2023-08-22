package stringUse;

public class StringClassUse {

	public static void main(String[] args) {
       
		
		String s= "Pune";
		String s1="PUNE";
		String s2=new String("pune");
		String s3=new String("Pune");
		
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println("=======================");
		
	    System.out.println(s.equalsIgnoreCase(s2));
	    System.out.println(s1.equalsIgnoreCase(s2));
	    System.out.println(s.equalsIgnoreCase(s3));
	    System.out.println(s2.equalsIgnoreCase(s));
	    
	    System.out.println("===========================");
	    
	    String str="Hello Mock W5";
	    String str1="";
	    String str2=" ";
	    String str3=null;
	    System.out.println(str.length());
	   // int l = str.length();
	    System.out.println("str1 Length  "+str1.isEmpty());
	    System.out.println("Str2 Length "+str2.isBlank());
	   //.out.println("Str3 Length  "+str3.length());
	    
	    System.out.println(str.contains(" mock "));
	    
	    System.out.println("============================");
	    
	    String p1="Hello";
	   // System.out.println(p1.lastIndexOf('l'));
	    
	    String p2="Good Morning, all Start Now, Colleagues";
	   // System.out.println(p2.lastIndexOf('o'));
	    
	   // System.out.println(p2.lastIndexOf("M"));
	    
	    
	    //System.out.println(p2.lastIndexOf("N"));
//	    System.out.println(p2.lastIndexOf('M',10));
//	    System.out.println(p2.lastIndexOf('r',10));
//	    System.out.println(p2.lastIndexOf('d',10));
//	    System.out.println(p2.lastIndexOf('w',10));

	   // System.out.println(p2.replace("Morning", "Evening"));
	    
	  String[] p3=p2.split(",");
//	  System.out.println(p3[0]);
//	  System.out.println(p3[1]);
//	  System.out.println(p3[2]);
	  
	  String[] p4=p2.split(",", 2);
	  //System.out.println(p4[1]);
	  System.out.println(p4[1]);
	  System.out.println(p4[2]);
	  
	  

		
		
		
		
	}

}
