package com.stackspace.demo;

public class AddTest {
	
	public int m1(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {

		AddTest test = new AddTest();
		System.out.println(test.m1(30, 50));
		
	}

}
