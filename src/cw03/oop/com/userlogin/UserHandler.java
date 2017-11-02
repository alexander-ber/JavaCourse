package cw03.oop.com.userlogin;

import cw03.oop.com.userlogin.User;

public class UserHandler {
	private User[] users;
		
	
    public UserHandler(int maximumUsers) {
		this.users = new User[maximumUsers];
	}
   
    public boolean addUser(String username, String password, String token) {
        int index = nextIndex();
        if (index >= 0) {
            User newUser = new User(username, password, token);
            this.users[index] = newUser;
            return true;
        }
        return false;
	}
    
    public String printUser(int index) {
    		return this.users[index].toString();
    }
	/**
     * @return the next available index in the products array or -1 if the array is full
     */
    private int nextIndex() {
        for (int i = 0; i < this.users.length; i++) {
            if (users[i] == null) {
                return i;
            }
        }
        return -1; // no place available
    }
	
}
