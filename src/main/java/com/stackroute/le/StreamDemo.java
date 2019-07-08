package com.stackroute.le;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
		StreamDemo streamDemo = new StreamDemo();
		streamDemo.findPlace();
	}
	public void findPlace(){
		List<String> places = new ArrayList<>();
		places.add("Nepal, Kathmandu");
		places.add("Nepal, Pokhara");
		places.add("India, Delhi");
		places.add("USA, New York");
		places.add("Africa, Nigeria");
		Stream<String>  stream = places.stream();
		stream.filter(city ->  city.startsWith("Nepal, ")).map(city-> city.replace("Nepal, ","")).forEach(System.out::println);
	}
	
}
