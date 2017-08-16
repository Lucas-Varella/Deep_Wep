package exercise2;

import java.util.Scanner;

public class Book {
	
	private Scanner keyboard;
	
	private BookList owner;
	private String title;
	private String author;
	private String numPages;
	private String bookAbstract;
	private int ageGroup;
	private int bookNumber;
	
	public Book(BookList owner) {
		this.owner = owner;
		keyboard = new Scanner(System.in);
	}
	
	public String getTitle() {
		return this.title;
	}
	public void getDetails(){
		System.out.println("Name: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Number of Pages: " + this.numPages);
		System.out.println("Book's age group: " + this.ageGroup);
		System.out.println("Book's Abstract:");
		System.out.print(this.bookAbstract);
		int option = 0;
		System.out.println();
				

	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setNumPages(String numPages) {
		this.numPages = numPages;
	}
	public void setBookAbstract(String bookAbstract) {
		this.bookAbstract = bookAbstract;
	}
	public void setAgeGroup(int ageGroup){
		this.ageGroup = ageGroup;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;		
	}

}
