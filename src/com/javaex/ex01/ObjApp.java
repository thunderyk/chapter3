package com.javaex.ex01;

public class ObjApp {

	public static void main(String[]args) {
		Object obj = new Object();
		
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		System.out.println(obj.equals(obj));

		System.out.println("=============================");
		System.out.println("obj.getClass()");
		System.out.println(obj.getClass());
		
		System.out.println("=============================");
		System.out.println("obj.hashCode()");
		System.out.println(obj.hashCode());
		
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		
		System.out.println("=============================");
		System.out.println("obj.toString");
		System.out.println(obj.toString());
		
		System.out.println("=============================");
		System.out.println("obj.euqals()");
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(obj01));
	}
}
