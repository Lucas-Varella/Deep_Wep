package exercise2;

public class FriendCtrl {

	private MainController owner;
	private FriendScreen friendScreen;
	private FriendList friendList;
	
	public FriendCtrl(MainController owner) {
		this.owner = owner;
		friendScreen = new FriendScreen(this);
		friendList = new FriendList(this);
	}

	public void showFriendMenu() {
		friendScreen.showFriendMenu();
		
	}
	
}
