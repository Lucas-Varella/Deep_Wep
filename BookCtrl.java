package exercise2;

public class BookCtrl {
	
	private BookScreen bookScreen;
	private MainController owner;
	private BookList bookList;


	
	public BookCtrl(MainController owner) {
		this.owner = owner;
		bookScreen = new BookScreen(this);
		bookList = new BookList(this);
	}

	public void showBookMenu() {
		bookScreen.showBookMenu();
	}
	public void addBook(){
		bookList.addBook();
	}
	

	public void showBookList() {
		bookList.showBookList();
	}

	public void showMainMenu() {
		owner.start();
	}

	public void deleteBook(String bookTitle) {
		bookList.deleteBook(bookTitle);
		
	}

}
