package com.koreait.ex;

public class LocalMain {

	public static void main(String[] args) {
		Local person1 = new Local();
		Local person2 = new Local();
		Local person3 = new Local();
		
		person1.setLocalInfo("ȫ�浿",20,"901215-1234567");
		person2.setLocalInfo("���쿣Ƽ��", 21, "911215-6789123");
		person3.setLocalInfo("james", 22);

		person1.output();
		person2.output();
		person3.output();
	}

}
