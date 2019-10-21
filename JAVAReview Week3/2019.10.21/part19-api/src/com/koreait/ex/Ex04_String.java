package com.koreait.ex;

public class Ex04_String {

	public static void main(String[] args) {
		String a = "apple";
		String b = "apple";  //  "apple" �Ѹ��� ���������
		
		System.out.println(a==b ? "apple 1��" : "apple 2��");
		
		String c = new String("banana");
		String d = new String("banana");  // �ٳ��� �ΰ� ����
		
		System.out.println(c==d ? "�ٳ��� 1��" : "�ٳ��� 2��");
		String sn = "951212-1234567";
		String[] snArr = sn.split("-"); // ���������� �и��Ͽ� ���� �迭�� ����
		
		for(String s : snArr) {
		System.out.println(s);
		}
		
		String today = "2019.10.21";
		String[] todayArr = today.split("\\.");  // ��� Ư�����ڴ� �տ� ������ 2��
		
		for(String s : todayArr) {
			System.out.println(s);
		}
		
		String today2 = String.join("-", todayArr); // �迭 ��� ���̿� ������ �־ ��ġ��
		System.out.println(today2);
		
		//valueOf
		//���� -> ���ڿ� : String.valueOf(10) == "10"
		//�Ǽ� -> ���ڿ� : String.valueOf(1.5) == "1.5"
		
		//substring
		//substring(�ε���) : �ε������� ����
		//substring(�����ε���, �����ε���) : ������ ����, ����� ������(���� ��)
		
		String phone = "010-1234-5678";
		
		String phone1 = phone.substring(0,3);
		String phone2 = phone.substring(4,8);
		String phone3 = phone.substring(9,13);
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println(phone3);
		
		System.out.println(phone1 + phone2 + phone3);
		
		
	}

}
