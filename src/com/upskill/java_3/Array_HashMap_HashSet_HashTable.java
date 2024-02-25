package com.upskill.java_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_HashMap_HashSet_HashTable {

	
	
	
	public static void main(String[] args) {
		
//		Array
		
		int[] ageFalcon = new int[] {25, 26, 27, 28, 30};
		
		System.out.println("Length of an Array is: " + ageFalcon.length);
		System.out.println("Student: " + ageFalcon[2]);
		System.out.println("Array: " + Arrays.toString(ageFalcon));
		
		String[] nameFalcon = new String[] {"Tahmid", "Salman", "Lubna", "Russel Vai"};
		
		System.out.println("Length of an Array is: " + nameFalcon.length);
		System.out.println("Student: " + nameFalcon[0]);
		System.out.println("Array: " + Arrays.toString(nameFalcon));
		
		boolean[] attendanceFalcon = new boolean[] {true, false, false, true};
		
		System.out.println("Length of an Array is: " + attendanceFalcon.length);
		System.out.println("Present: " + attendanceFalcon[0]);
		
//		Multi-Dimentional Array
		
		int[][] ageFalcon2D = {{12,13,14}, {20,21,22}};
		
		System.out.println("Length of an Array is: " + ageFalcon2D.length);
		System.out.println("Student 1: " + ageFalcon2D[0][1]);
		System.out.println("Student 2: " + ageFalcon2D[1][0]);
		System.out.println("Array: " + Arrays.deepToString(ageFalcon2D));
	
		
//		Hash Map store multiple value using key-value pair allow multithreading
		
		HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
		
		StudentAge.put("Tahmid", 24);
		StudentAge.put("Lubna", 24);
		StudentAge.put("Salman", 27);
		StudentAge.put("Rumi", 35);
		
		System.out.println("HashMap Student Age: " + StudentAge.get("Salman"));
		System.out.println(StudentAge.replace("Tahmid", 24, 25));
		System.out.println(StudentAge);
		
		System.out.println(StudentAge.remove("Rumi", 35));
		
		System.out.println("\n");
		
		HashMap<String, String> CountryCapital = new HashMap<String, String>();
		
		CountryCapital.put("USA", "Washington DC");
		CountryCapital.put("Bangladesh", "Dhaka");
		CountryCapital.put("Paskitan", "Islamabad");
		CountryCapital.put("England", "London");
		
		System.out.println("HashMap Student Age: " + CountryCapital.get("Bangladesh"));
		System.out.println(CountryCapital);
		System.out.println(CountryCapital.keySet());
		System.out.println(CountryCapital.values());
		
		System.out.println("\n");
		
//		Hash Table store multiple value using key-value pair doesnot allow multithreading 
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("USA", "America");
		Region.put("Bangladesh", "Asia");
		Region.put("Paskitan", "Asia");
		Region.put("England", "Europe");
		
		System.out.println("HasTable Region: " + Region.get("Bangladesh"));
		System.out.println(Region);
		
		
//		Hash Set store unordered collection containing unique value
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Audi");
		car.add("Tesla");
		
		System.out.println("HashSet Car: " + car);
		
		
		/*2D String Array*/
		
		String[][] string2DArray = {{"a","b","c"}, {"A", "B", "C"}};
		System.out.println("Letter is: " + string2DArray[1][0]);
	
		/****************** Attendance HashMap *************/
		
		HashMap<String, Boolean> Attendance = new HashMap<String, Boolean>();
		
		Attendance.put("a", true);
		Attendance.put("b", false);
		Attendance.put("c", true);
		Attendance.put("d", false);
		
		System.out.println(Attendance.get("c"));
		System.out.println(Attendance);
		System.out.println(Attendance.keySet());
		System.out.println(Attendance.values());
		
		/********** HashSet for StudentId ***********/
		
		HashSet<Integer> StudentId  = new HashSet<>();
		StudentId.add(100);
		StudentId.add(101);
		StudentId.add(103);
		
		System.out.println("Student ID: " +StudentId);
		
	}

}
