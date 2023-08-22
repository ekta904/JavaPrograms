package practice2;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {

		ArrayList<Integer> arr= new ArrayList<>();

		arr.add(100);
		arr.add(134);
		arr.add(155);
		arr.add(1065);
		arr.add(1766);
		arr.add(105);
		arr.add(100);

		ListIterator<Integer> lt = arr.listIterator();

		while(lt.hasNext()) {

			System.out.println(lt.next());
		}




	}

}
