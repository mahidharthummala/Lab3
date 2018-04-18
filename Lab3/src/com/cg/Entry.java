package com.cg;

public class Entry {
public static void main(String[] args) {
	Employee e = new Employee("mahi",20000.00);
	System.out.println("Employee name is "+e.getName()+ " salary is "+e.getSalary());
	
	Employee e1 = new Employee("Lohit",50000.00);
	System.out.println("Employee name is "+e1.getName()+ " salary is "+e1.getSalary());
	System.out.println("===============================================");
	
	PermanentEmployee p = new PermanentEmployee("saurabh",10000.00);
	PermanentEmployee p1 = new PermanentEmployee("mahesh",10000.00);
	
	System.out.println("permanent employees count is "+PermanentEmployee.count);
	System.out.println("name of permanent employee is "+p.getName()+","+" permanent salary is "+p.getSalary());
	System.out.println("name of permanent employee is "+p1.getName()+","+" permanent salary is "+p1.getSalary());
	System.out.println("===============================================");
	
	ContractEmployee c = new ContractEmployee(9);
	Contractor con = new Contractor("amit",100.00);
	c.setContractor(con);
	c.getContractor();
	
	System.out.println("contract employees count is "+ContractEmployee.count);
	System.out.println("contractor name is "+con.getName()+","+" contractEmployee salary is "+c.getSalary());
	System.out.println("===============================================");
	
}
}
