package com.javaex.ex04;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void showInfo() {
		System.out.println("");
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public boolean equals(Object obj) {
		Point target =(Point)obj;
		
		if(this.x == target.x && this.y == target.y) {
			return true;
		}else {
			return false;
		}
	}
	
}
