package exercise2;

import java.util.ArrayList;

public class BookList {
	
	ArrayList<Book> books = new ArrayList<Book>();
	//bookNumber keeps track of how many books there are. it's also used for indexes!
	int bookNumber = 0;
	private BookCtrl owner;
	
	public BookList(BookCtrl owner){
		this.owner = owner;
		
	}


	public void addBook(Book book) {
		bookNumber++;
		books.add(book);
	}


	public void showBookList() {
		System.out.println("There are currently " + bookNumber + " Books ::");
		for(int i = 0; i < bookNumber ; i++) {
			int bookIndex = i + 1;
			System.out.println(bookIndex + ". - " + books.get(i).getName());
		}
		
		
	}


	public void deleteBook(String bookName) {
		books.remove(bookName);
		bookNumber--;
	}

}
