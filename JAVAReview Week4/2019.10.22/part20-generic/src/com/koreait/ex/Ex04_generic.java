package com.koreait.ex;

class Room<T1, T2> {
	private T1 furniture1;
	private T2 furniture2;
	
	// Method
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ù��° ���� : " ).append(furniture1).append("\n");
		sb.append("�ι�° ���� : " ).append(furniture2);
		return sb.toString(); // string Ÿ������ ������ �������.
	}
	public void setFurniture1(T1 furniture1) {
		this.furniture1 = furniture1;
	}
	public void setFurniture2(T2 furniture2) {
		this.furniture2 = furniture2;
	}
}
//���� ( Chair, Table, Bed, DressTable )
class Chair { 
	private String name;
	
	public Chair(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}	
}

class Table { 
	@Override
	public String toString() {
		return "���̺�";
	}
}
class Bed { 
	@Override
	public String toString() {
		return "ħ��";
	}
}
class DressTable { 
	public String toString() {
		return "����";
	}
}

public class Ex04_generic {

	public static void main(String[] args) {
		Room<Chair, Table> room1 = new Room<>();
		Room<Bed, DressTable> room2 = new Room<>();
		
		room1.setFurniture1(new Chair("���� ����"));
		room1.setFurniture2(new Table());
		room2.setFurniture1(new Bed());
		room2.setFurniture2(new DressTable());
		System.out.println(room1);
		System.out.println(room2);

	}

}
