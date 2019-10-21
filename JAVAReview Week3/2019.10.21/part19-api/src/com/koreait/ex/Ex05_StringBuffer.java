package com.koreait.ex;

public class Ex05_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("apple");
		StringBuffer sb2 = new StringBuffer("apple");
		System.out.println(sb1 == sb2 ?  "1��" : "2��");
		
		System.out.println("sb1 �ؽ��ڵ尪(�ּҰ�) = " + sb1.hashCode());
		System.out.println("sb2 �ؽ��ڵ尪(�ּҰ�) = " + sb2.hashCode());
		
		//�˻� : �ؽ��ڵ� �� -> ���� ��

		//StringBuffer �� ���ڿ��� ������ ��쿡 ����Ѵ�.
		StringBuffer sb = new StringBuffer();
		
		System.out.println("�⺻ ����ũ�� : " + sb.capacity());
		//sb�� ���ڿ� �߰�
		//append(�߰��Ұ�)
		sb.append("hello");
		sb.append(" Java").append("¯"); // �����ؼ� �� ½� ���̱�   ü�̴� ���.
		
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		//����
		StringBuffer phone = new StringBuffer();
		phone.append("010-1233-5678");
		phone.deleteCharAt(3); // 3�� �ε����� ���̰��� ������ ������
		phone.deleteCharAt(7); // �׷��� �ι��� �������� 8���� �ƴϰ� 7����.
		
		System.out.println(phone);
		

	}

}
