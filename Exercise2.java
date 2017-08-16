
package exercise2;

import java.util.ArrayList;

public class Exercise2 {
	
	public static void main(String[] args) {
		MainController mainCtrl = new MainController();
		mainCtrl.start();
		
		Friend friend = new Friend();
		
		friend.setName("Gerso");
		friend.setPhone(6969);
		
		ArrayList<Friend> friends = new ArrayList<Friend>();
	}

}
