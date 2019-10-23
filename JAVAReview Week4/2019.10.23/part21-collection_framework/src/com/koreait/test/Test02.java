package com.koreait.test;

import java.util.ArrayList;
import java.util.List;

// ÄÁÅ×ÀÌ³Ê
class Container<T> {
	
	// Field
	private List<T> list = new ArrayList<>();
	
	// Method
	public void add(T item) {
		list.add(item);
	}
	public T get(int index) {
		return list.get(index);
	}
	public int size() {
		return list.size();
	}
	
}

// ÃÑ
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

public class Test02 {

	public static void main(String[] args) {
		
		Container<Gun> container = new Container<>();
		
		container.add(new Gun("k1"));
		container.add(new Gun("k2"));
		container.add(new Gun("k9"));

		for (int i = 0; i < container.size(); i++) {
			System.out.println(container.get(i));
		}
		
	}

}
