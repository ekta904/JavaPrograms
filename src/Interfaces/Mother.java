package Interfaces;

public interface Mother {
	
	void beuty();
	void nature();
	default void love() {
		System.out.println("Mother's Love");
	}
	static void emotions() {
		System.out.println("Mother's Emotions");
	}


}
