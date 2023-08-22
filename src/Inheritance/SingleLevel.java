package Inheritance;

public class SingleLevel {

	public static void main(String[] args) {
        Father f= new Father();
        f.money();
		Son.bike();
		Son.home(); // Father class static method calling with the help of Son Class
		
		Son s = new Son();
		s.laptop();
		s.money();// Father class non static method calling with the help of Son Class
//		//GrandSon g = new GrandSon();
//		g.SchoolBag(); //these are non static methods of super and 
//		g.laptop();// super super class.
//		g.money();
		
		GrandSon.Toys();//these are static method of super and super super class
		GrandSon.bike();
		GrandSon.home();
		Father.main(null);
	}

}
