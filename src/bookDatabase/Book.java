package bookDatabase;

public class Book {
	
	private String SKU; 
	private String title; 
	private String author; 
	private String description; 
	private double price;
	
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		this.SKU = sKU;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescritption() {
		return description;
	}
	public void setDescritption(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//basic constructor 
	public Book() {
		
	}
	/**
	 * @param sKU
	 * @param title
	 * @param author
	 * @param description
	 * @param price
	 */
	public Book(String sKU, String title, String author, String description, double price) {
		super();
		SKU = sKU;
		this.title = title;
		this.author = author;
		this.description = description;
		this.price = price;
	}
}