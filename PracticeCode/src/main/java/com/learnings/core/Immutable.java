package com.learnings.core;
/*
 */
public class Immutable {
	public static void main(String args[]) {
		System.out.println("testing immutability");
		Employee e=new Employee("rajesh",1);
	}
}
class Employee{
	private final String name;
	private final Integer id;
	public Employee(String name,Integer id) {
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
}
