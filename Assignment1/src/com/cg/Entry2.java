package com.cg;

public class Entry2 {

	public static void main(String[] args)
	{

	String[] employeenames = {"mahidhar", "chaitanya", "Bharath", "Sai charan", "sai"};	
	String[] countryNames = {"india", "Uganda", "Thailand", "America", "India"};	
	String[] cityNames = {"hyderabad", "Mumbai", "Pune", "Chennai", "Delhi"};	
	String[] lineNames = {"101", "102", "103", "104", "105"};	
    City[] city = new City[5];
    Country[] country = new Country[5];
    Address[] address = new Address[5];
    Employee[] e = new Employee[5];
    
    for(int i=0;i <5;i++)
    {
    city[i] = new City();
    city[i].setName(cityNames[i]);
    country[i]= new Country();
    country[i].setName(countryNames[i]);
    country[i].setCity(city[i]);
    address[i] = new Address();
    address[i].setLine(lineNames[i]);
    address[i].setCountry(country[i]);
    e[i] = new Employee();
    e[i].setName(employeenames[i]);
    e[i].setAddress(address[i]);
    }
   for(int j=0;j<5;j++)
   {
	System.out.println("Name:" + e[j].getName());
	System.out.println("Address:" + e[j].getAddress().getLine());
	System.out.println("Country:" + e[j].getAddress().getCountry().getName());
	System.out.println("City:" +e[j].getAddress().getCountry().getCity().getName());	
	System.out.println("------------------------------------------------------");
   }
}
}
