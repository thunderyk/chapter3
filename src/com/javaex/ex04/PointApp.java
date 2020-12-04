package com.javaex.ex04;

public class PointApp {

	public static void main(String[]args) {
		
		Point p = new Point(2,3);
		Point p01 = new Point(2,3);
		Point p02 = new Point(5,8);
		
		System.out.println(p.equals(p01));
	}
}
