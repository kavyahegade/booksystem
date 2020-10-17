package miniproject2;

import java.util.*;

public  class database {
	TreeSet<Book> bookSet=new TreeSet<Book>();
	public database() {
	
	Book b1=new Book(1,"xyz","john",2000);
	Book b2=new Book(2,"abc","michel",3500);
	Book b3=new Book(3,"qwe","harry",4000);
	Book b4=new Book(4,"fghj","potter",5000);
	
	
	bookSet.add(b1);
	bookSet.add(b2);
	bookSet.add(b3);
	bookSet.add(b4);
	}
	
	
public void showDetails() { 
    
    Iterator<Book>itr=bookSet.iterator();
		  while(itr.hasNext()) {
	  System.out.println(itr.next());} 
	  
	  }

	  
	  
public void viewByname(String name) {
  
for(Book b:bookSet ) {
	  if(b.title.equals(name)) {
		  System.out.println(b);
	  }
  }

}



public void insert(Book b) {
	
	// TODO Auto-generated method stub
	bookSet.add(b);
	 System.out.println("book added successfully");
	
	
}
public void delete(int id) {
	
	// TODO Auto-generated method stub
	boolean notFound=true;
	Iterator<Book>itr=bookSet.iterator();
	
	while(itr.hasNext())
	{
		
	Book bookSet=itr.next();
	if(bookSet.bookId==id) {
		notFound=false;
	
		itr.remove();
		System.out.println("book deleted");
	}
	
}
	if(notFound)
	{
		System.out.println("no book found"); 
	}

}

public void update(int id,String title,String author,double price) {
	
	Iterator<Book> itr=bookSet.iterator();
	while(itr.hasNext()) {
		
		if(itr.next().bookId==id)
		{
			itr.remove();
			Book b= new Book(id,price);
			bookSet.add(b);
		}
		
		
		
		
		
		
		
}
}
	
}







