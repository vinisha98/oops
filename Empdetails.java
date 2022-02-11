package com.oops;

public class Empdetails {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays; 
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	
	public Empdetails(String company, int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth){
	
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	
	public void computeEmpWage() {
		
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
		totalEmpWage = totalEmpHrs * empRatePerHour; 
		}
	@Override
	public String toString() {
		return "Total Emp Wage for" + company + " is: " + totalEmpWage;
	}
	
	public static void main(String[] args) {
		Empdetails dMart = new Empdetails("DMart",20,20,100);
		Empdetails reliance = new Empdetails("Reliance",40,50,200);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
}