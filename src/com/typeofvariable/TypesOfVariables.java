package com.typeofvariable;

public class TypesOfVariables {

	String Name = "Amit"; // instance variable
	static String Gender = "M"; // static variable
	
	public void fullnamne() {
		int agelimit = 20; // local variable
		System.out.println(Name + " " + Gender + " " + agelimit);
	}
	public static void main(String[] args) {
		TypesOfVariables tv = new TypesOfVariables();
		tv.fullnamne();
		 

	}

}
