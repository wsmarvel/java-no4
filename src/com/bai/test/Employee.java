package com.bai.test;

import java.io.*;

public class Employee {
	//��ʵ������������ɼ�
	public String name;
	//��˽�б��������ڸ���ɼ�
	private double salary;
	//�ڹ������ж�name��ֵ
	public Employee(String empName) {
		
		name = empName;
		
	}
	//�趨salary��ֵ
	public void setSalary(double empSalary) {
		
		salary =  empSalary;
		
	}
	//��ӡ��Ϣ
	
	public void printEmp() {
		
		System.out.println("���֣� "+ name);
		System.out.println("нˮ�� "+ salary);
	}
	
	public static void main(String args[]) {
		
		Employee employee = new Employee("bai");
		employee.setSalary(1000);
		employee.printEmp();
		
		
		
	}
	
}
