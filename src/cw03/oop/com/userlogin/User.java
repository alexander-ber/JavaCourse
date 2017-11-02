package cw03.oop.com.userlogin;

import java.util.Random;

public class User {
	
	//Static variable declaration
	private static int nextId = 1;
	
	//Static constant declaration
	private static final int MAX_NUMBER = 1000;
	
	private String username;
	private String password;
	
	//Final, not static
	private final String token;
	private int id;
	
	public User(String username, String password, String token) {
		this.username = username;
		this.password = password;
		this.token = token;
		this.id = nextId++;
		
		if (nextId > MAX_NUMBER) {
			nextId = 1;
		}
	}
	
	public void generate() {
		Random random = new Random();
		int validId = random.nextInt(MAX_NUMBER) + 1;
		System.out.println(validId);
	}

	//@Override
	public String toString() {
		return "User [ id = " +id + ", username=" + username + ", password=" + password + ", token=" +token+ "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getToken() {
		return this.token;
	}
	
}
