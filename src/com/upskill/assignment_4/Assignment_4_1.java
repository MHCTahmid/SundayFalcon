package com.upskill.assignment_4;

public class Assignment_4_1 {

	/*Write a user program using encapsulation that contains 
	 * the username, password, email, first and last names of a user of our application. 
	 * Display the user information in console output?*/
	
	private String username = "Upskill2024";
	private String password = "upskill_1234";
	private String email;
	private String firstName;
	private String lastName;
	
	/*Getter Method*/
	
	public String getUserName(){
		return username;
	}
	
	public String getPassword(){
		return password;
	}
	
	
	/*Setter Method*/
	
	public void setEmail(String value){
		email = value;
	}
	
	public void setFirstName(String value){
		firstName = value;
	}
	
	public void setLastName(String value){
		lastName = value;
	}
	
	
	
	public static void main(String[] args) {
		Assignment_4_1 obj = new Assignment_4_1();
		System.out.println(obj.getUserName());
		System.out.println(obj.getPassword());
		obj.setEmail("upskill2024@gmail.com");
		obj.setFirstName("MHC");
		obj.setLastName("Tahmid");
	}

}
