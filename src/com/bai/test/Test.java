package com.bai.test;

public class Test {
	public void pupAge() {
		//age是一个局部变量
		int age = 0;
		age = age + 7;
		System.out.println("小狗的年龄是 "+ age);
	}

	public static void main(String args[]) {
		Test test = new Test();
		test.pupAge();
		
	}
}
