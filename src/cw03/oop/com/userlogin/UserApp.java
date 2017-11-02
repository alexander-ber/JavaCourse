package cw03.oop.com.userlogin;

import cw03.oop.com.userlogin.UserHandler;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserHandler users = new UserHandler(3);
		users.addUser("Billi Gaitss", "12345", "jhjkhkjjkhjkh");
		users.printUser(0);
		System.out.println(users.printUser(0));
	}

}
