package myPackage;
//import pacakge.Inheritance;

public class AccessModi {
	public int pub=27;
	protected static String pro="Protected";
	char a='C';
	private float f=270.2f;

	public static void main(String[] args) {
          
		AccessModi am=new AccessModi();
	 System.out.println(am.f);
	 System.out.println(am.a);
	 System.out.println(am.pro);
	 System.out.println(am.pub);
		
	}

}
