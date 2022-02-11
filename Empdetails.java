package com.oops;

public class Empdetails {
	
	public static void main(String[] args){
	
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		
		int empCheck=(int)Math.floor(Math.random()*10)%2;
		
		if(empCheck == IS_PART_TIME) {
			empHrs = 4;
			System.out.println("Employee is part timer");
		}
		else if(empCheck == IS_FULL_TIME) {
			empHrs = 8;
			System.out.println("Employee is full timer");
		}
		else {
			empHrs = 0;
			System.out.println("Employee is absent timer");
		}
		empWage = empHrs + EMP_RATE_PER_HOUR;
		System.out.println("employee wage is: " + empWage);
		}
}
