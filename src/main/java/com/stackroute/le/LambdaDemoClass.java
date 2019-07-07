package com.stackroute.le;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaDemoClass {
	
	Employee emp1 = new Employee(24, "shin","chan");
	Employee emp2 = new Employee(20, "hima","wari");
	Employee emp3 = new Employee(34, "harry","nohara");
	Employee emp4 = new Employee(26, "nobita","nobi");
	List<Employee> list = new ArrayList<>(Arrays.asList(emp1,emp2,emp3,emp4));

	public static void main(String[] args){
		LambdaDemoClass lambdaDemoClass = new LambdaDemoClass();
		lambdaDemoClass.sortList();
	}
	public void sortList(){
	
//		sorting using comparator interface by lambda method
		Collections.sort(list,(emp1, emp2) -> {return emp1.getLastName().compareTo(emp2.getLastName());});
		
		System.out.println("Name\tLast name\tAge");
//		traverse sorted list
		for (Employee li: list){
			System.out.println(li.getName()+"\t"+li.getLastName()+"\t\t"+li.getAge());
		}
		
//		finds the emp whose last name starts with C
		System.out.println("\nEmployee whose last name starts with C");
		list.stream().filter(list -> list.getLastName().startsWith("c") || list.getLastName().startsWith("C")).forEach(this::process);
	
	}
	
	private void process(Employee employee) {
		System.out.println(employee.getName()+"\t"+employee.getLastName()+"\t\t"+employee.getAge());
		
	}
}
