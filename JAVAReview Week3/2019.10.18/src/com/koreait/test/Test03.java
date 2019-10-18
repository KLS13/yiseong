package com.koreait.test;

class Coordinate {
	
	private int x;
	private int y;
	
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	@Override
	public String toString() {
		return "Coordinate [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Coordinate) {
			Coordinate other = (Coordinate)obj;
			return x== other.x && y == other.y;
		}else {
			return false;
		}
	}
}

class Circle {

	private Coordinate center;
	private double radius;

	public Circle(int x,int y, double radius) {
		center = new Coordinate(x,y);
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj !=null && obj instanceof Circle) {
			Circle other = (Circle)obj;
			center.equals(other.center);
			return center.equals(other.center) && other.radius == radius;
		}else {
		return false;
		}
	}		
}
public class Test03 {

	public static void main(String[] args) {

		Circle cir1 = new Circle(0,0, 1.5);
		Circle cir2 = new Circle(0,0, 1.5);
		
		if(cir1.equals(cir2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}

}
