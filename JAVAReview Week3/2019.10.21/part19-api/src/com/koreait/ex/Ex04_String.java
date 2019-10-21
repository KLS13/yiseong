package com.koreait.ex;

public class Ex04_String {

	public static void main(String[] args) {
		String a = "apple";
		String b = "apple";  //  "apple" 한마나 만들어진다
		
		System.out.println(a==b ? "apple 1개" : "apple 2개");
		
		String c = new String("banana");
		String d = new String("banana");  // 바나나 두개 생성
		
		System.out.println(c==d ? "바나나 1개" : "바나나 2개");
		String sn = "951212-1234567";
		String[] snArr = sn.split("-"); // 하이픈으로 분리하여 각각 배열에 저장
		
		for(String s : snArr) {
		System.out.println(s);
		}
		
		String today = "2019.10.21";
		String[] todayArr = today.split("\\.");  // 몇몇 특수문자는 앞에 슬래시 2개
		
		for(String s : todayArr) {
			System.out.println(s);
		}
		
		String today2 = String.join("-", todayArr); // 배열 요소 사이에 하이픈 넣어서 합치기
		System.out.println(today2);
		
		//valueOf
		//정수 -> 문자열 : String.valueOf(10) == "10"
		//실수 -> 문자열 : String.valueOf(1.5) == "1.5"
		
		//substring
		//substring(인덱스) : 인덱스부터 추출
		//substring(시작인덱스, 종료인덱스) : 시작은 포함, 종료는 불포함(종료 전)
		
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
