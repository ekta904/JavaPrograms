package InterfacesUse;
//in interfaces no main methods are present
//which means they will never execute.
public interface MyInterface {
	
	
	
	//public MyInterFace() {}// interface can't have constructors**** 
	//so the objects can't be created
	
	
	//static final int a=10; //no need to declare like this
	int a=10;//a is static as well as final by default
	// interface variables are by default static and Final*****
	
	void test() ;//it is by default public and abstract.****
      // interfaces methods will never have body
}
