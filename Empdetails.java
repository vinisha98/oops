package com.oops;

public class Empdetails {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static int computeEmpWage(String company, int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth){
	
		int empHrs = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		
		while (totalEmpHrs < maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
		
			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()*10)%2;
		
			switch (empCheck) {
				case  IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
			}
		
			totalEmpHrs += empHrs;
			System.out.println("day: " + totalWorkingDays + "Emp hrs: " +empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour; 
		System.out.println("Total Emp Wage: " + totalEmpWage);		
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage("DMart",20,20,100);
		computeEmpWage("DMart",40,50,200);
	}
}