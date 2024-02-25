package com.upskill.java_6;

public class Exception_TryCatchFinally {

	/* Java Exceptions - Use "try - catch - finally"
	 
	A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations
		 1. ArithmeticException - error has occurred in an arithmetic operation.
		 2. ArrayIndexOutOfBoundsException -  an array has been accessed with an illegal index.
		 3. ClassNotFoundException - try to access a class whose definition is not found
		 4. FileNotFoundException - a file is not accessible or does not open.
		 5. IOException - input-output operation failed or interrupted
		 6. InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted.
		 7. NoSuchFieldException - class does not contain the field or variable specified
		 8. NoSuchMethodException - accessing a method which is not found
		 9. NullPointerException - referring to the members of a null object
		 10. NumberFormatException  -  a method could not convert a string into a numeric format
		 11. RuntimeException - any exception which occurs during runtime.
		 12. StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the size of the string
	
	B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java
*/
	
	
	public static void main(String[] args) throws myException {
		
		/*Buit in Exception*/
		
		try{
			int[] ageFalcon = new int[]{10, 11, 13, 20};
			System.out.println("Student Age = " + ageFalcon[12]);
		} catch(Exception e){
			e.printStackTrace();
			System.out.println("Array index is not correct !");
		}
		
		/*Specific Built in Exception*/
		
		try{
			int num = Integer.parseInt("Five");
			System.out.println(num);
		} catch(NumberFormatException e){
			e.printStackTrace();
			System.out.println("A method could not convert a string into a numeric format");
		}
		
		finally{
			System.out.println("Test Completed");
		}
		
		/*User Defined Exception*/
		
		try{
			throw new myException("Test");
		} catch(Exception e){
			e.printStackTrace();
			System.out.println("This is User Defined Exception");
		}
		
		finally{
			System.out.println("Test Completed");
		}
		
		

	}

}
