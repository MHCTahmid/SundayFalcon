package com.upskill.assignment_3;


/*Bank is a class that provides functionality to get interest rate. 
Display different interest rate using rate functionality for Chase, City and TD banks followed by 8%, 7% and 9%. 
Hints: using method override.*/

public class Assignment_3_3 {
	
	double interest = 0;
	public Assignment_3_3(double a){
		interest = a;
	}
	
	public static void main(String[] args) {
		ChaseBank chase = new ChaseBank(0.08);
		CityBank city = new CityBank(0.07);
		TdBank td = new TdBank(0.09);

	}
}

