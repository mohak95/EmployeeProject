package com.java8.prefunctionaldemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo  {

	
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		
		list1.stream().forEach((t)-> System.out.println("Printing "+t));
		
	}
	

}
