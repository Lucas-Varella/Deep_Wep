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
		System.out.println("5. Borrow Book");
		System.out.println("6. Return Book");
		System.out.println("7. Main Menu");

		
		int option = 0;
		
		
		System.out.println("Please input desired Option (1-7) ::");
		option = keyboard.nextInt();
		if (option == 1) {
			owner.addBook();
		}	
		if (option == 3) {
			owner.showBookList();
			int choice = 0;
			System.out.println("Input 1 to go back, or 0 to exit.");
			choice = keyboard.nextInt();
			if(choice == 1) {
				owner.showBookMenu();
			}else if(choice == 0) {
				System.out.println("Goodbye!");
			}
		}	
		if (option == 7) {
			owner.showMainMenu();
		}	
		if (option == 4) {
			System.out.println("Please input book's name for deletion.");
			keyboard.nextLine();
			String bookTitle = keyboard.nextLine();
			String choice = "X";
			System.out.println("Are you sure you want to delete this book?");
			System.out.println("Y / N");
			choice = keyboard.next();
			if(choice.equals('Y') || choice.equals("y")) {
				owner.deleteBook(bookTitle);
				System.out.println("Book '" + bookTitle + "' deleted from database!");
				int choice1 = 0;
				System.out.println("Input 1 to go back, or 0 to exit.");
				choice1 = keyboard.nextInt();
				if(choice1 == 1) {
					owner.showBookMenu();
				}else if(choice1 == 0) {
					System.out.println("Goodbye!");
				}
			}else if(choice.equals("N") || choice.equals("n")) {
				owner.showBookMenu();
			}
			
		}	
		
	}
}
