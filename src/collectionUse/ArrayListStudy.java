package collectionUse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {


		ArrayList<Object> al =new ArrayList<>();

		al.add("Saurabh");
		al.add("Omkar");
		al.add("Ekta");
		al.add(62);
		al.add(96);
		al.add(97);
		al.add(true);
		al.add(null);
		al.add("");
		al.add(13.3211);
		System.out.println(al);

		Object al1 = al.clone();

		System.out.println(al1);

		System.out.println(al.contains(true));

		System.out.println(al.getClass());

		System.out.println(al.get(5));

		al.add(0, "Abhishek");

		//	System.out.println(al);
		//	
		//	al.remove(7);
		//	System.out.println(al);
		//	al.remove(9);
		//	System.out.println(al);
		//	al.clear();
		//	System.out.println(al);
		System.out.println("===================================");

		System.out.println(al.equals(al1));

		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}

		System.out.println("====================================");

		for(Object o : al)
		{
			System.out.println(o);
		}

		System.out.println("===================================");

		Iterator<Object> it = al.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===================================");

		ListIterator<Object> lit = al.listIterator();

		while(lit.hasNext()) {

			System.out.println(lit.next());
		}

		System.out.println("===================================");





	}

}
