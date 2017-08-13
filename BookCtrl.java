package exercise2;

public class BookCtrl {
	
	private BookScreen bookScreen;
	private MainController owner;

	
	public BookCtrl(MainController owner) {
		this.owner = owner;
		bookScreen = new BookScreen(this);
	}

	public void showBookMenu() {
		bookScreen.showBookMenu();
	}
	
	

	
	
	

}
