package com.koreait.ex;

import java.util.Arrays;

class Container <T> {
	
	// Field
	private T[] items;
	
	// Constructor
	@SuppressWarnings("unchecked")		// 명확하지 않은 타입 체크이지만 더 이상 경고 날리지 마라!
	public Container(int capacity) {
		items = (T[])(new Object[capacity]);
	}
	
	// Method
	// add
	public void add(T item) {
		// 순차적으로 순회하다가 빈 자리가 발견되면 그 자리에 저장하기
		// items 배열에 item 변수 저장하기
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				break;
			}
		}
		
	}
	// getItems
	public T[] getItems() {
		return items;
	}
	
}

class Gun {
	
	// Field
	private String model;
	
	// Constructor
	public Gun(String model) {
		this.model = model;
	}
	
	// Method
	@Override
	public String toString() {
		return model;
	}
	
}

public class Ex05_generic {

	public static void main(String[] args) {

		Container<Gun> container = new Container<>(10);		// Constructor
		
		container.add(new Gun("K1"));
		container.add(new Gun("K2"));
		container.add(new Gun("K9"));
		
		System.out.println(Arrays.toString(container.getItems()));
		
	}

}
