package com.test;

import static java.lang.System.out;

class Entry{
	
	
	public static void main(String[] args){
		out.println("Employee details");
		
		Employee e = null;
		Date d=null;
	//	e = new Employee();
	//	e.displayDetails();
		 d=new Date(22,10,1995);
//	 d.Date(22,10,1995);
		e = new Employee("SURESH","RAYAPUREDDY",22344,"A",d);
		e.displayDetails();
//		d.Date(22,10,2016);
		d=new Date(22,10,1995);
               e = new Employee("NARESH","RAYAPUREDDY",22344,"A",d);
	       e.displayDetails();
	       d=new Date(22,10,2015);
               e = new Employee("RAMESH","RAYAPUREDDY",22344,"A",d);
		e.displayDetails();
		d=new Date(22,10,2014);
e = new Employee("MAHESH","RAYAPUREDDY",22344,"A",d);
		e.displayDetails();
		
		
		
	}
	
	
}
