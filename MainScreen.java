package exercise2;
import java.util.Scanner;

public class MainScreen {
	
	private Scanner keyboard;
	private MainController owner;
	
	public MainScreen(MainController owner) {
		this.owner = owner;
		keyboard = new Scanner(System.in);
		
	}

	public void showMainMenu() {
		
		System.out.println("----- SysBooks -----");
		System.out.println("--- Options:");
		System.out.println("1. Books");
		System.out.println("2. Friends");
		System.out.println("3. Borrowings");
		System.out.println("4. Borrow History");
		System.out.println("5. Exit");

		int option = 0;
		
		System.out.println("Please input desired Option (1-5) ::");
		option = keyboard.nextInt();
		if (option == 1) {
			owner.showBookMenu();
		} else if (option == 2) {
			owner.showFriendMenu();
		}else if(option == 5) {
			System.out.println("Goodbye!");
		}
		
		
	}

}
