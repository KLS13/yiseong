package com.koreait.ex;

public class Ex10_operator03 {

	public static void main(String[] args) {
		/* 
		 ���迬����
		  >= : �̻�, ũ�ų� ����
		  >  : �ʰ�, ũ��
		  <= : ����, �۰ų� ����
		  <  : �̸�, �۴�
		  == : ����
		  	equals
		  != : ���� �ʴ�
		  
		  ��������
		  && : and ����
		  || : or ����
		  !  : not ����
		  short evaluate �� ����
		  
		 ���� ������
		  -  ? :    (���ǽ�) ?  true�ϰ�� : false�ϰ��
		 */
		
		int a = 10;
		System.out.println(a == 10 && a < 100); 
		System.out.println(a != 10 || a == 10); 
		System.out.println(!(a==10));
		
		int b = 10;
		boolean result = (a==100) && (++b > 10);
		System.out.println("result : " + result + ", b : " + b);
		
		int age = 18;
		boolean isAdult = (age >= 20) ? true : false;
		int fee = isAdult? 4000 : 2000;
		System.out.println(("��� : " + fee));
		
		String id = "admin";
		String auth = id.equals("admin") ? "��������" : "��������";
		
		System.out.println(auth);
		
	}

}
