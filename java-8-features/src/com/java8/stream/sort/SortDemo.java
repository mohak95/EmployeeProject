package com.java8.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.stream.api.Database;
import com.java8.stream.api.Employee;

public class SortDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("john");
		list.add("peter");
		list.add("josh");
		list.add("jen");
		
		list.stream().sorted().forEach(t->System.out.println(t));
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		List<Employee> employees = Database.getEmployees();
		
		Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
		
		System.out.println(employees);
		
		employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(t->System.out.println(t));

		employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(t->System.out.println(t));

		employees.stream().sorted(Comparator.comparing(emp-> emp.getSalary())).forEach(System.out::println);

		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

	}

}
