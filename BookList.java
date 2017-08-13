package exercise2;

public class BookList {
	
	String[] books;
	int bookNumber = 0;
	private BookCtrl owner;
	
	public BookList(BookCtrl owner){
		this.owner = owner;
		
	}


	public void addBook(String bookName) {
		bookNumber++;
		String bookIndex = bookNumber + bookName;
		books[bookNumber - 1] = bookIndex;
	}

}
