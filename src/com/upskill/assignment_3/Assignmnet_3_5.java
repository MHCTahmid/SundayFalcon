package com.upskill.assignment_3;

/*Dingdong program : Write a Java program that prints the numbers from 1 to 50. 
But for multiples of three prints "Ding" instead of the number and for the multiples of five prints "Dong". 
For numbers which are multiples of both three and five print "Dingdong"*/

public class Assignmnet_3_5 {

	public static void dingDong(){
		for(int i = 1; i <= 50; i++){
			if(i % 5 == 0){
				if(i % 3 == 0)
					System.out.print(" Dingdong ");
				
				else
					System.out.print(" Dong");
			}
			else if(i % 3 == 0){
				System.out.print(" Ding");
			}
			else
				System.out.print(" "+ i);
		}
	}
	
	
	public static void main(String[] args) {
		
		dingDong();

	}

}
