package Inheritance;

public class Apple extends Fruit{
	
	// Method inside sub class
    public Apple() {
 
        // Print statement
        System.out.println("Subclass constructor invoked");
 
        // Displaying object hash code of sub class
        System.out.println("Sub class object hashcode :" +
                           this.hashCode());
 
        System.out.println(this.hashCode() + " " +
                           super.hashCode());
 
        System.out.println(this.getClass().getName() + " " +
                           super.getClass().getName());
    }

}
