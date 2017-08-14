package exercise2;


public class MainController {
	
	private MainScreen mainScreen;
	private BookCtrl bookCtrl;
	private FriendCtrl friendCtrl;
	
	public MainController() {
		mainScreen = new MainScreen(this);
		bookCtrl = new BookCtrl(this);
		friendCtrl = new FriendCtrl(this);
	}

	public void start() {
		
		mainScreen.showMainMenu();
		
	}

	public void showBookMenu() {
		bookCtrl.showBookMenu();
		
	}

	public void showFriendMenu() {
		friendCtrl.showFriendMenu();
		
	}

}
