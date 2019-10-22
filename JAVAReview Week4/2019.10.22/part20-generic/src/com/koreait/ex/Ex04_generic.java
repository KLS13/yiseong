package com.koreait.ex;

class Room<T1, T2> {
	private T1 furniture1;
	private T2 furniture2;
	
	// Method
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("첫번째 가구 : " ).append(furniture1).append("\n");
		sb.append("두번째 가구 : " ).append(furniture2);
		return sb.toString(); // string 타입으로 리턴을 해줘야함.
	}
	public void setFurniture1(T1 furniture1) {
		this.furniture1 = furniture1;
	}
	public void setFurniture2(T2 furniture2) {
		this.furniture2 = furniture2;
	}
}
//가구 ( Chair, Table, Bed, DressTable )
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
		return "테이블";
	}
}
class Bed { 
	@Override
	public String toString() {
		return "침대";
	}
}
class DressTable { 
	public String toString() {
		return "옷장";
	}
}

public class Ex04_generic {

	public static void main(String[] args) {
		Room<Chair, Table> room1 = new Room<>();
		Room<Bed, DressTable> room2 = new Room<>();
		
		room1.setFurniture1(new Chair("앱코 의자"));
		room1.setFurniture2(new Table());
		room2.setFurniture1(new Bed());
		room2.setFurniture2(new DressTable());
		System.out.println(room1);
		System.out.println(room2);

	}

}
