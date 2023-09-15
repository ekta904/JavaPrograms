package newPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class IndexOFMethod {

	public static void main(String[] args) {
       
		
		 ArrayList<String> al=new ArrayList<String>();
		 al.add("India");
		 al.add("china");
		 al.add("shrilanka");
		 al.add("Pakistan");
		 Iterator it= al.iterator() ;
	
		 while(it.hasNext())
		 {
			
			 System.out.println(it.next());
		 }
		 

	}

}
