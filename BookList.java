package exercise2;

public class bookList {
	
	String[] books;
	int bookNumber = 0;

	public void addBook(String bookName) {
		bookNumber++;
		String bookIndex = bookNumber + bookName;
		books[bookNumber - 1] = bookIndex;
	}

}
