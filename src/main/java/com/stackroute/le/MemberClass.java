package com.stackroute.le;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MemberClass {
	public static void main(String[] args) {
		MemberClass memberClass = new MemberClass();
		memberClass.member();
		memberClass.numberOperation();
	}
	
	public void member() {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("ahana");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		Stream<String> stream;
		stream = memberNames.stream();
		System.out.println("Names starts with A:");
		stream.filter(name -> name.startsWith("A")).forEach(System.out::println);
		System.out.println();
		
		stream = memberNames.stream();
		System.out.println("Names in uppercase");
		stream.map(name -> name.toUpperCase()).forEach(System.out::println);
		System.out.println();
		
		stream = memberNames.stream();
		System.out.println("Names in uppercase whose name ends with s");
		stream.filter(name -> name.endsWith("s") ).map(name -> name.toUpperCase() ).forEach(System.out::println);
		System.out.println();
		
		stream = memberNames.stream();
		System.out.println("Count of name ends with h");
		System.out.println(stream.filter(name -> name.endsWith("h")).count());
		System.out.println();
		
		stream = memberNames.stream();
		System.out.println("Name starts with ‘S’");
		stream.filter(name -> name.startsWith("S")).forEach(System.out::println);
		System.out.println();
	}
	
	public void numberOperation(){
		List<Integer> list = new ArrayList<>(Arrays.asList(4,66,33,44,71));
		System.out.println("Even numbers in the list");
		Stream<Integer> stream = list.stream();
		stream.filter(num -> num%2 == 0).forEach(System.out::println);
	}
}
