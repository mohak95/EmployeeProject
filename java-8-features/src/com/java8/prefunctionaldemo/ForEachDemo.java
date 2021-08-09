package com.java8.prefunctionaldemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		
		List<String> list = new ArrayList<>();
		
		list.add("john");
		list.add("peter");
		list.add("josh");
		list.add("jen");
		
		
		list.stream().filter(t->t.startsWith("j")).forEach(t->System.out.println(t));
		
		map.put(1, "a");
		map.put(2, "ab");
		map.put(3, "abc");
		map.put(4, "abcd");
		
		map.forEach((k,v)->System.out.println(k+" : "+v));
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj -> System.out.println(obj));
		
		Consumer<String> consumer = (t) ->  System.out.println(t);
		for(String s1: list) {
			consumer.accept(s1);
		}
	}
	
}
