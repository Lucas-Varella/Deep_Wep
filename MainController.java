package exercise2;


public class MainController {
	
	private MainScreen mainScreen;
	private BookCtrl bookCtrl;

	
	public MainController() {
		mainScreen = new MainScreen(this);
		bookCtrl = new BookCtrl(this);
	}

	public void start() {
		
		mainScreen.showMainMenu();
		
	}

	public void showBookMenu() {
		bookCtrl.showBookMenu();
		
	}

}
