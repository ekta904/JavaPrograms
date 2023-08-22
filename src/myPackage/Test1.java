package myPackage;

public class Test1 {
      
	
//	public  int a;
//	public String name;
//	public Integer I;
//	
////	public IfElse()
////	{
////        a= 10; 
////	}	
//	
//	public static void main(String[] args) {
//        IfElse e= new IfElse();
//        int b=11;
//        System.out.println(e.a);
//        System.out.println(b);
//        System.out.println(e.I);
//        System.out.println(e.name);
//        
//        
//        
//	
//	}
//	
//	public void test()
//	{
//		int c;
//        IfElse f= new IfElse();
//        f.name="Anaya";

        static int x = 11;
        private int y = 33;
        public void method1(int x)
        {
            Test1 t = new Test1();
            x = 22;
            y = 44;
     
            System.out.println("Test.x: " + Test1.x);
            System.out.println("t.x: " + x);
            System.out.println("t.y: " + t.y);
            System.out.println("y: " + y);
        }
     
        public static void main(String args[])
        {
            Test1 t = new Test1();
            t.method1(5);
            System.out.println(t.y);
            System.out.println(x);
            
        }
		
		
	
}
