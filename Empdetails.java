package com.oops;

public class Empdetails {
	
	public static void main(String[] args){
	
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 2;
		int empHrs = 0;
		int empWage = 0;
		
		int empCheck=(int)Math.floor(Math.random()*10)%2;

		if(empCheck == IS_FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs + EMP_RATE_PER_HOUR;
		System.out.println("employee wage is: " + empWage);
	}
}
