package Interfaces;

public interface B extends A {
	
	void test3();
	String s="Avanya";
    int p=20;
    
    default void test4() {
    	System.out.println("HI Test 4 in B");
    }
    static void test5()
    {
    	System.out.println("Hi Test 5 in B");
    }    

}
