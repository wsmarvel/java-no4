package com.bai.test;

import java.io.*;

public class Employee {
	//该实例变量对子类可见
	public String name;
	//该私有变量，仅在该类可见
	private double salary;
	//在构造器中对name赋值
	public Employee(String empName) {
		
		name = empName;
		
	}
	//设定salary的值
	public void setSalary(double empSalary) {
		
		salary =  empSalary;
		
	}
	//打印信息
	
	public void printEmp() {
		
		System.out.println("名字： "+ name);
		System.out.println("薪水： "+ salary);
	}
	
	public static void main(String args[]) {
		
		Employee employee = new Employee("bai");
		employee.setSalary(1000);
		employee.printEmp();
		
		
		
	}
	
}
