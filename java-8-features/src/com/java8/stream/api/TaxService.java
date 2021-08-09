package com.java8.stream.api;


import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

	public static List<Employee> evaluateTax(String input){
		
		List<Employee> list = Database.getEmployees();
		if(input.equalsIgnoreCase("tax")) 
			return list.stream().filter(p->p.getSalary()<=500000).collect(Collectors.toList());	
		else	
			return list.stream().filter(p->p.getSalary()>500000).collect(Collectors.toList());	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(evaluateTax("tax"));
		
		
		
		
		
	}

}
