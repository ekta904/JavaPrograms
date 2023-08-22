package collectionUse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {

      LinkedList<String> ll=new LinkedList<>();
      
      ll.add("Anaya");
      ll.add("Avanish");
      ll.add("Atul");
      ll.add("Ekta");
      ll.add("Khandekar");
      
      for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}

		System.out.println("====================================");

		for(Object o : ll)
		{
			System.out.println(o);
		}

		System.out.println("===================================");

		Iterator<String> it = ll.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===================================");

		ListIterator<String> lit = ll.listIterator();

		while(lit.hasNext()) {

			System.out.println(lit.next());
		}

	}

}
