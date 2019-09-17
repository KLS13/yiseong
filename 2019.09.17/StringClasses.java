//문자열을 나타내는 또 다른 클래스와 기존 String 클래스 간의 차이
public class StringClasses {

	public static void main(String[] args) {
		String str = new String();
		str = "Hello";
		String str2 = str.concat("Girl");
		
		System.out.println(str.concat("Boy")); //HelloBoy
		System.out.println(str.substring(2)); //substring(2) : n까지 빼기, 2까지 빼기  llo
		System.out.println(str);
		
		
		StringBuffer strbuffer = new StringBuffer();
		strbuffer.append("Hello"); // Hello
		strbuffer.append("Hello2"); // Hello Hello2
		strbuffer.reverse(); //문자열 뒤집기
		System.out.println(strbuffer); // 2olleHolleH
		
		//String 객체는 원본이 그대로 남고, StringBuffer 객체는 원본이 변함
		//String 클래스는 immutable(불변)클래스
		//--->메서드 호출 시에 새로운 객체를 생성하여 반환
		//StringBuffer 클래스는 mutable(가변)클래스
		//--->메서드 호출 시에 자기 자신을 반환합니다!
	}

}
