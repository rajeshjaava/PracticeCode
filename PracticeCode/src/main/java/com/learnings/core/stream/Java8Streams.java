package com.learnings.core.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {
	public static void main(String args[]) {
		Employee e1=new Employee(1,"Rajesh",150000,"Tpt");
		Employee e2=new Employee(2,"Ramesh",15000,"ctr");
		Employee e3=new Employee(3,"Rakesh",50000,"ptr");
		Employee e4=new Employee(4,"Suresh",100000,"Tpt");
		Employee e5=new Employee(5,"Mahesh",1000,"Tpt");
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		//Stream Filter : print the elements matched with name 
		empList.stream().filter(e->e.getName().equals("Rajesh")).forEach(System.out::println);
		//increment salary 10% for employee suresh
		//empList.stream().filter(e->e.getName().equals("Suresh")).map(e
		
		empList.forEach(n->System.out.print(n));
	}

}




class Employee{
	Employee(int id,String name,long sal,String address){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.address=address;
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String name;
	private long sal;
	private String address;
	public String toString() {
		return "id : "+id+"  name : "+name+"  sal :"+sal+" address :"+address;
	}
}
