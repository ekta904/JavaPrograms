package collectionUse;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
       
		Vector<Integer> v= new Vector<>();
		
		v.add(11);
		v.add(22);
		v.add(33);
		v.add(44);
		v.add(55);
		v.add(66);
		v.add(77);
		v.add(88);
		v.add(99);
		v.add(110);
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}

		System.out.println("====================================");

		for(Object o : v)
		{
			System.out.println(o);
		}

		System.out.println("===================================");

		Iterator<Integer> it = v.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("===================================");

		ListIterator<Integer> lit = v.listIterator();

		while(lit.hasNext()) {

			System.out.println(lit.next());
		}
		
		System.out.println("==================================");
		
		Enumeration<Integer> en = v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}

		
		
	}

}
