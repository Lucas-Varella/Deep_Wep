package exercise2;

import java.util.ArrayList;

public class BookList {
	
	ArrayList<String> books = new ArrayList<String>();
	int bookNumber = 0;
	private BookCtrl owner;
	
	public BookList(BookCtrl owner){
		this.owner = owner;
		
	}


	public void addBook(String bookName) {
		bookNumber++;
		String bookIndex = bookNumber + ". " + bookName;
		books.add(bookIndex);
	}


	public void showBookList() {
		System.out.println(books);
		
	}

}
