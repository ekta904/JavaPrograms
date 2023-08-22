package Interfaces;

public interface A //Please observe the things
{
	int a =10; // the variables are by default static and final.
	
	void test();// methods are by default abstract
	// methods only allowed to be declared not define(Body).
	
	void test1();
	
	default void test2() {
		System.out.println("Hi Test2");
	}
	static void test3() {
		System.out.println("HI Static Test 3 in A ");
	}
	
	

	
}
