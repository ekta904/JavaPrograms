package Inheritance;

public class Fruit {
	
	public Fruit() {

		// Print statement
		System.out.println("Super class constructor");

		// Displaying object hash code of super class
		System.out.println("Super class object hashcode :" +
				this.hashCode());

		System.out.println(this.getClass().getName());

	}

}
