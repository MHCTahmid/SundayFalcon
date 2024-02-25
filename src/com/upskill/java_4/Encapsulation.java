package com.upskill.java_4;


public class Encapsulation {
	private String name = "Tahmid";
	private int ssn;
	private int mobile = 55555554;
	private String username = "upskill2024";
	private String password;
	
//	Setter Method
	
	public void setName(String value){
		name = value;
	}
	
//	Getter Method
	
	public String getName(){
		return name;
	}
	
	public void setpassword(String value){
		password = value;
	}
	
	public String getusername(){
		return username;
	}
	
	public void setSsn(int value){
		ssn = value;
	}
	
	public int getmobile(){
		return mobile;
	}
	
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Mhtahmidchy");
		System.out.println(obj.getName());
		obj.setSsn(12345);
		obj.setpassword("upskill2024");
		System.out.println(obj.getusername());
		obj.getusername();
		obj.setpassword("upskill2024");
	}
	
	public void setssn2(int a){
		int value = a;
	}
	
	public String getname2(){
		return username;
		
	}
}
