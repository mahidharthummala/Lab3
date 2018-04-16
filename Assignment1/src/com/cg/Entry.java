package com.cg;

public class Entry {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setName("Mahi");
		Address address=new Address();
		address.setLine("f.no-207");
		Country country=new Country();
		country.setName("India");
		City city=new City();
		city.setName("Hyderbad");
		employee.setAddress(address);
		address.setCountry(country);
		country.setCity(city);
		System.out.println("Name: " +employee.getName());
		System.out.println("Address: " +employee.getAddress().getLine());
		System.out.println("Country: " +employee.getAddress().getCountry().getName());
		System.out.println("City: " +employee.getAddress().getCountry().getCity().getName());
		
	}

}
