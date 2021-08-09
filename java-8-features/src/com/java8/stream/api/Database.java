package com.java8.stream.api;

import java.util.ArrayList;
import java.util.List;

public class Database {

	public static List<Employee> getEmployees(){
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(123, "Roshan", "IT", 600000));
		list.add(new Employee(456, "Bikash", "CIVIL", 900000));
		list.add(new Employee(789, "Bimal", "DEFENSE", 500000));
		list.add(new Employee(012, "SOurav", "CORE", 400000));
		list.add(new Employee(234, "Prakash", "SOCIAL", 1200000));
		
		return list;
	}
	
}
