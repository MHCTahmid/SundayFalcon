package com.upskill.java_1;



public class Variables {
	
	
	public String country = "United States of America";									/*Instance or Global variable - variable declared in class level, outside method*/
	
	static String region = "America";								/*Static variable - variable belong to class and don't need an object*/

	public static void main(String[] args) {
		
		Variables obj = new Variables();
		String city = "NYC";									/*local variable - variable declared in method*/
		obj.CT("Essex");
	}
	
	public void NJ(){
		String city = "Paterson";
		System.out.println(city);															/*local variable - variable declared in method*/
	}
	
	public void CT(String county){									/*method parameter - variable used as method variable*/
		String city = county;
		System.out.println(city);									/*local variable - variable declared in method*/
	}

}
