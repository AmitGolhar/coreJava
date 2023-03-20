package com.typeofvariable;

public class InstanceVariables {
	int a = 10;
	int b = 20;
	int c = a + b;

	public static void main(String[] args) {
		InstanceVariables iv = new InstanceVariables();
		System.out.println(iv.c);
	}

}
