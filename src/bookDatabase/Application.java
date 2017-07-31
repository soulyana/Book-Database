package bookDatabase;

public class Application {

	public static void main(String[] args) {
		//creates book
		//place books inside arraylist in bookdatabase class
		//search for books
		//create 3 methods: search by author, category, and SKU
		// >> also can just use one method with parmaters that fit required search query 
		// >> searchBy(author, name) 
		
		//Book newBook1 = new Book(String sKU, String title, String author, String description, double price)
		
		BookDatabase newbookDB = new BookDatabase(); 
		
		Book newbook1 = new Book(); 
		newbook1.setSKU("Java1001");
		newbook1.setTitle("Head First Java");
		newbook1.setAuthor("Kathy Sierra and Bert Bates"); 
		newbook1.setDescritption("Easy to read Java workbook");
		newbook1.setPrice(47.50);
		
		newbookDB.addBook(newbook1); 
		
		Book newbook2 = new Book(); 
		newbook2.setSKU("Java1002");
		newbook2.setTitle("Thinking in Java");
		newbook2.setAuthor("Bruce Eckel"); 
		newbook2.setDescritption("Details about Java under the hood");
		newbook2.setPrice(20.00);
		
		newbookDB.addBook(newbook2); 
		
		Book newbook3 = new Book(); 
		newbook3.setSKU("Orcl1003");
		newbook3.setTitle("OCP: Oracle Certified Professional Java SE");
		newbook3.setAuthor("Jeanne Boyarsky"); 
		newbook3.setDescritption("Everything you need to know in one place");
		newbook3.setPrice(45.00);
		
		newbookDB.addBook(newbook3); 
		
		Book newbook4 = new Book(); 
		newbook4.setSKU("Python1004");
		newbook4.setTitle("Automate the Boring Stuff with Python");
		newbook4.setAuthor("Al Sweigart"); 
		newbook4.setDescritption("Fun with Python");
		newbook4.setPrice(10.50);
		
		newbookDB.addBook(newbook4); 
		
		Book newbook5 = new Book(); 
		newbook5.setSKU("Zombie1005");
		newbook5.setTitle("The Maker's Guide to the Zombie Apocalypse");
		newbook5.setAuthor("Simon Monk"); 
		newbook5.setDescritption("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
		newbook5.setPrice(16.50);
		
		newbookDB.addBook(newbook5); 
		
		Book newbook6 = new Book(); 
		newbook6.setSKU("Rasp1006");
		newbook6.setTitle("Raspberry Pi Projects for the Evil Genius");
		newbook6.setAuthor("Donald Norris"); 
		newbook6.setDescritption("A dozen fiendishly fun projects for the Raspberry Pi!");
		newbook6.setPrice(14.75);
		
		newbookDB.addBook(newbook6); 

	}
}
