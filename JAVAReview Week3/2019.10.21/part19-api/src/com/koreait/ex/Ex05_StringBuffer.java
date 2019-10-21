package com.koreait.ex;

public class Ex05_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("apple");
		StringBuffer sb2 = new StringBuffer("apple");
		System.out.println(sb1 == sb2 ?  "1개" : "2개");
		
		System.out.println("sb1 해시코드값(주소값) = " + sb1.hashCode());
		System.out.println("sb2 해시코드값(주소값) = " + sb2.hashCode());
		
		//검색 : 해시코드 비교 -> 동등 비교

		//StringBuffer 는 문자열을 만들어내는 경우에 사용한다.
		StringBuffer sb = new StringBuffer();
		
		System.out.println("기본 버퍼크기 : " + sb.capacity());
		//sb에 문자열 추가
		//append(추가할값)
		sb.append("hello");
		sb.append(" Java").append("짱"); // 연속해서 쩜 쩍어서 붙이기   체이닝 기법.
		
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		//삭제
		StringBuffer phone = new StringBuffer();
		phone.append("010-1233-5678");
		phone.deleteCharAt(3); // 3번 인덱스를 줄이고나면 뒷줄은 떙겨짐
		phone.deleteCharAt(7); // 그래서 두번쨰 하이픈이 8번이 아니고 7번임.
		
		System.out.println(phone);
		

	}

}
