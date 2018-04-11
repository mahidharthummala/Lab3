package com.test;

class Date{
	
	 
private int day; 
private int month;
private int year;

	
	// Default constructor
	
	public  Date(int da,int mo,int ye){
		this.day=da;
		this.month=mo;
		this.year=ye;	
	}
	public String toString() {
		//System.out.println(day + "-" + month + "-" +year);
        return String.format(day + "-" + month + "-" +year);
	}
}