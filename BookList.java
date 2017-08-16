package exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
	
	ArrayList<Book> books = new ArrayList<Book>();
	//bookNumber keeps track of how many books there are. it's also used for indexes!
	int bookNumber;
	private BookCtrl owner;
	private Scanner keyboard;
	private Book book;
	
	public BookList(BookCtrl owner){
		this.owner = owner;
		keyboard = new Scanner(System.in);
		book = new Book(this);
		
	}


	public void addBook() {
		if(bookNumber > 0) {
			keyboard.nextLine();
		}
		bookNumber++;
		book = new Book(this);
		int choice = 0;
		book.setBookNumber(this.bookNumber);
		System.out.println("Please input the book's Title::");

		book.setTitle(keyboard.nextLine());
		System.out.println("Please input the book's Author::");

		book.setAuthor(keyboard.nextLine());
		System.out.println("Please input the number of pages in this book::");

		book.setNumPages(keyboard.nextLine());
		System.out.println("Please write a short description for the book::");

		book.setBookAbstract(keyboard.nextLine());
		System.out.println("Please select the book's age Group::");
		System.out.println("1 - Children");
		System.out.println("2 - Teens");
		System.out.println("3 - Adult");

		book.setAgeGroup(keyboard.nextInt());
		books.add(book);
		System.out.println("Book " + book.getTitle() + " added!");
		System.out.println("Input 1 to go back, or 0 to exit.");
		choice = keyboard.nextInt();
		if(choice == 1) {
			owner.showBookMenu();
		}else if(choice == 0) {
			System.out.println("Goodbye!");
		}
		
	}


	public void showBookList() {
		System.out.println("There are currently " + bookNumber + " Books ::");
		for(int i = 0; i < bookNumber ; i++) {
			int bookIndex = i + 1;
			System.out.println(bookIndex + ". - " + books.get(i).getTitle());
		}
		int choice = 0;
		System.out.println("Input book's number to see details, or '0' to go back.");
		choice = keyboard.nextInt();
		if(choice == 0) {
			owner.showBookMenu();
		}else{
			this.book = books.get(choice - 1);
			book.getDetails();
		}
		
		
	}


	public void deleteBook(String bookTitle) {
		books.remove(bookTitle);
		bookNumber--;
	}


	public void showBookMenu() {
		owner.showBookMenu();
		
	}

}
