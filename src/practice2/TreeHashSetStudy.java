package practice2;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeHashSetStudy {

	public static void main(String[] args) {


		TreeSet<Integer> arr=new TreeSet<>();
		
		arr.add(100);
		arr.add(134);
		arr.add(155);
		arr.add(1065);
		arr.add(1766);
		arr.add(105);
		arr.add(100);

		Iterator<Integer> lt =  arr.iterator();

		while(lt.hasNext()) {

			System.out.println(lt.next());
		}


	}

}
