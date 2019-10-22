package com.koreait.ex;

import java.util.Arrays;

class Container <T> {
	
	// Field
	private T[] items;
	
	// Constructor
	@SuppressWarnings("unchecked")		// ��Ȯ���� ���� Ÿ�� üũ������ �� �̻� ��� ������ ����!
	public Container(int capacity) {
		items = (T[])(new Object[capacity]);
	}
	
	// Method
	// add
	public void add(T item) {
		// ���������� ��ȸ�ϴٰ� �� �ڸ��� �߰ߵǸ� �� �ڸ��� �����ϱ�
		// items �迭�� item ���� �����ϱ�
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
