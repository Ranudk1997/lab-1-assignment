package com.example.lab1;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	  private int id;
	  private String name;
	  private double salary;
	  private String busineessUnit ;
	  public String getBusineessUnit() {
		return busineessUnit;
	}
	public void setBusineessUnit(String busineessUnit) {
		this.busineessUnit = busineessUnit;
	}
	private int age;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show()
	{
		System.out.println("Employee id"+" = 1"+);
		System.out.println("Employee name"+"="+ "piyush raj  niranjan");
		System.out.println("Employee salary"+"="+ 25000);
		System.out.println("Employee EBU"+"="+ "BES-BU");
		System.out.println("Employee Age"+"="+30);
	}
	  
}
