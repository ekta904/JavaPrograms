package practice2;

public class StringToFloat {

	public static void main(String[] args) {

      String  s="13.31";
      float f =Float.parseFloat(s);
      System.out.println(s+" " +f);
      
//      int i=Integer.parseInt(s);
//      System.out.println(i);
//      
      double d=Double.parseDouble(s);
      System.out.println(d);
      
      int a= 120;
      String s1=String.valueOf(a);
      System.out.println(s1);
      
      String s2="123454356786";
      long l=Long.parseLong(s2);
      System.out.println(l);
      
	}

}
