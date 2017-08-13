package exercise2;

import java.util.Scanner;

public class BookScreen {
	
	private BookCtrl owner;
	private Scanner keyboard;

	
	public BookScreen(BookCtrl owner) {
		this.owner = owner;
		keyboard = new Scanner(System.in);

	}
	
	
	public void showBookMenu() {
		
		System.out.println("----- Book Stuff -----");
		System.out.println("--- Options:");
		System.out.println("1. New Book");
		System.out.println("2. Alter Book");
		System.out.println("3. Book List");
		System.out.println("4. Del. Book");
		
		int option = 0;
		
		//Aqui eu só copiei e colei o processo de scanner de MainScreen...
		//ainda vou continuar a mexer nisso.
		
		System.out.println("Please input desired Option (1-4) ::");
		option = keyboard.nextInt();
		if (option == 1) {
			owner.showBookMenu();
		}	
		
	}
}
