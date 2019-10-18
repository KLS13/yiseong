package com.koreait.ex;

class Sample {
	@Override
	public String toString() {
		return "Sample";
	}
}

public class Ex01_Object {

	public static void main(String[] args) {
		
		Object object = new Object();
		
		object = 10;
		System.out.println(object);
		
		object = 4.55;
		System.out.println(object);
		
		object = "hello";
		System.out.println(object);

		object = new Sample();
		System.out.println(object.toString());
		System.out.println(object);
		
	
	}

}
