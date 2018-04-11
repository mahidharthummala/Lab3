package com.test;

import static java.lang.System.out;

class Entry{
	
	
	public static void main(String[] args){
		out.println("Employee details");
		
		Employee e = null;
		Date d=null;
		 d=new Date(22,10,1995);
		e = new Employee("mahidhar","thummala",12345,"A",d);
		e.displayDetails();
		d=new Date(22,10,1995);
               e = new Employee("ravuri","chaitanya",34567,"A",d);
	       e.displayDetails();
	       d=new Date(22,10,2015);
               e = new Employee("sai","charan",23456,"A",d);
		e.displayDetails();
		d=new Date(22,10,2014);
e = new Employee("shaik","haneef",12345,"A",d);
		e.displayDetails();
		
		
		
	}
	
	
}
