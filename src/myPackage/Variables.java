package myPackage;

public class Variables {


	int a=10;
	static String  name="Avanish";

	public static void main(String[] args) {
		
		Variables v1=new Variables();

		v1.Var3();
		
		Var2();

		Var1 v2=new Var1();
		
		v2.Var();
	}

	public static void Var2()
	{
		Variables v=new Variables();
		
		System.out.println("Calling non static variable of the same class:  "+v.a);
		
		System.out.println("Inside Var2 of Variables  ");

		System.out.println("Calling static String from same class :"+name);

		System.out.println("Calling variable c from Var1  "+Var1.c);

	}   

	public void Var3()
	{
		//Variables v=new Variables();
		System.out.println("Inside the not static method Var3 of Class Variables  ");	

		System.out.println("Calling Integer variable a of the same class:  "+a);
	}}
