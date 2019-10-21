package com.koreait.ex;

class Box {
	private Object obj;
	
	public Object getObj() {
		return obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
}

class BallPen { }
class Pencil { }

public class Ex01_generic {

	public static void main(String[] args) {
		
		Box box = new Box(); // 디폴트 생성자가 자동으로 생성된 뒤 호출됨
		
		box.setObj(new BallPen());
		BallPen myPen = (BallPen)box.getObj();
		
		box.setObj(new Pencil());
		Pencil myPencil = (Pencil)box.getObj();
		System.out.println(myPencil);
	}
}
