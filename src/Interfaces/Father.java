package Interfaces;

public interface Father {
	
	void house();
	void car();
	default void love() {
		System.out.println("Father's Love");
	}
	static void emotions() {
		System.out.println("Father's Emotions");
	}

}
