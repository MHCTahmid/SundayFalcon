package com.upskill.java_2;

/* Four Types of Loops:
1.For Loop
2.While Loop
3.Do While Loop
4.Infinity Loop
*/

public class Loops {

	public static void main(String[] args) {
		forLoop();
		whileLoop();
		doWhileLoop();
//		infinityLoop();
		nestedLoop();
	}
	
	public static void forLoop(){
		System.out.println("For Loop:");
		for(int i=1; i<=10; i++){
			System.out.println("For Loop Number: " + i);
		}
	}
	
	public static void whileLoop(){
		System.out.println("While Loop:");
		int i = 1;
		while(i <= 10){
			System.out.println("While Loop Number: " + i);
			i++;
		}
	}
	
	public static void doWhileLoop(){
		int i = 11;
		System.out.println("Do While Loop:");
		do{
			System.out.println("Do While Loop Number: " + i);
			i++;
		}while(i<=10);
	}
	
	public static void infinityLoop(){
		System.out.println("Infinity Loop:");
		for(int i=1; i<10; i--){
			System.out.println("For Loop Number: " + i);
		}
	}
	
	public static void nestedLoop(){
		System.out.println("Nested Loop:");
		for(int i = 1; i <= 10; i++){
			for(int j = 1; j <= 10; j++){
				int m =i*j;
				System.out.print(m + " ");
			}
			System.out.println(" ");
		}
	}

}
