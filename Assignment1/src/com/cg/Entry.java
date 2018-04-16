package com.cg;

public class Entry {
	public static void main(String[] args) {
		Employee employee=new Employee();
		Address address=new Address();
		Country country=new Country();
		City city=new City();
		
		employee.setName("Mahi");
		employee.setAddress(address);
		address.setLine("f.no-207");
		address.setCountry(country);
		country.setName("India");
		country.setCity(city);
		city.setName("Hyderbad");
		
		System.out.println("Name: " +employee.getName());
		System.out.println("Address: " +employee.getAddress().getLine());
		System.out.println("Country: " +employee.getAddress().getCountry().getName());
		System.out.println("City: " +employee.getAddress().getCountry().getCity().getName());
		System.out.println("-----------------------------------------------------------");
		
		employee.setName("Chaitanya");
		employee.setAddress(address);
		address.setLine("f.no-208");
		address.setCountry(country);
		country.setName("India");
		country.setCity(city);
		city.setName("Hyderbad");
		
		System.out.println("Name: " +employee.getName());
		System.out.println("Address: " +employee.getAddress().getLine());
		System.out.println("Country: " +employee.getAddress().getCountry().getName());
		System.out.println("City: " +employee.getAddress().getCountry().getCity().getName());
		System.out.println("-----------------------------------------------------------");
		
		employee.setName("Bharath");
		employee.setAddress(address);
		address.setLine("f.no-209");
		address.setCountry(country);
		country.setName("India");
		country.setCity(city);
		city.setName("Hyderbad");
		
		System.out.println("Name: " +employee.getName());
		System.out.println("Address: " +employee.getAddress().getLine());
		System.out.println("Country: " +employee.getAddress().getCountry().getName());
		System.out.println("City: " +employee.getAddress().getCountry().getCity().getName());
		System.out.println("-----------------------------------------------------------");
	}

}
