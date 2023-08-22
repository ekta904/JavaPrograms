package practice2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Book {

	
	  int id;
	  String name, author, publisher;
	  int quantity;
	  public Book(int id, String name, String author, String publisher, int quantity)
	  {
		  this.id=id;
		  this.name=name;
		  this.author=author;
		  this.publisher=publisher;
		  this.quantity=quantity;
	  }
	  
	  public static void main(String[] args) {
			
			List<Book> list= new ArrayList<Book>();
			
			Book b1= new Book(101, "Lets us C", "Yashwant Kanetkar", "BPB" , 8);
			Book b2= new Book(102, "Advance Java", "Rajendra", "BPB" , 23);
			Book b3= new Book(103, "Operating system", "Galvin", "Wiley" , 5);
			Book b4= new Book(105, "Java Black Book", "XYZ", "ABC" , 9);
			
			list.add(b1);
			list.add(b2);
			list.add(b3);
			list.add(b4);
			
			System.out.println("Original Content of the List ");
			System.out.println("==========================================================");
			
			for(Book b:list) {
				
				System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
			}
			
			System.out.println("=========================================================");
			
			Iterator<Book> itr = list.iterator();
			while(itr.hasNext()){
				Book st = (Book)itr.next();
				
				System.out.println(st.id+" "+st.name+" "+st.author+" "+st.publisher+" "+st.quantity);

				
			}
			

			
}}
