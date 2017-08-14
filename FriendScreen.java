package exercise2;

import java.util.Scanner;

public class FriendScreen {

	private FriendCtrl owner;
	private Scanner keyboard;
	
	public FriendScreen(FriendCtrl owner) {
		this.owner = owner;
		keyboard = new Scanner(System.in);

	}
	
	public void showFriendMenu() {
		System.out.println("----- Friend Stuff -----");
		System.out.println("--- Options:");
		System.out.println("1. New Friend");
		System.out.println("2. Alter Friend");
		System.out.println("3. Friend List");
		System.out.println("4. Del. Friend");
		System.out.println("5. Main Menu");

		
	}

}
