package com.oops;

public class Empdetails {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	
	public static void main(String[] args){
	
		int empHrs = 0;
		int empWage = 0;
		
		int empCheck=(int)Math.floor(Math.random()*10)%2;
		switch (empCheck) {
		case  IS_PART_TIME:
			empHrs = 4;
			System.out.println("Employee is part timer");
			break;
		case IS_FULL_TIME:
			empHrs = 8;
			System.out.println("Employee is full timer");
			break;
		default:
			empHrs = 0;
			System.out.println("Employee is absent timer");
		}
		empWage = empHrs + EMP_RATE_PER_HOUR;
		System.out.println("employee wage is: " + empWage);
		}
}
