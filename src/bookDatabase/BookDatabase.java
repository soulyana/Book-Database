package bookDatabase;

import java.util.*;

public class BookDatabase {

	ArrayList <Book> bookList;
		
	public BookDatabase() {
		this.bookList = new ArrayList <Book>(); 
	}
	
	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addBook(Book bookToAdd) {
		bookList.add(bookToAdd); 
	}
	
	//returns an arraylist of books by author name that matches search query
	public ArrayList <Book> searchByAuthor(String author) {
		ArrayList <Book> authors = new ArrayList <Book>();
		
		//create for loop to iterate through arraylist to find matching book
		for(Book authorSearch : bookList) {
			if(authorSearch.getAuthor().contains(author)){
				authors.add(authorSearch);
			}
			
		}
		return authors;
	}
	
	

}