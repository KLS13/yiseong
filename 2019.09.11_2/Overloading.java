//Overloading.java를 실행시키면
//JVM은 main 메서드를 동작시킴
public class Overloading {
	
	static int add(int x, int y) {
		return x+y;
	}
	static int add(int x, int y, int z) {
		return x+y+z;
	}
	
	static int add3(int x, int y, int z, int k) {
		return x+y+z+k;
	}

	public static void main(String[] args) {
		System.out.println(add(2,2));
		//클라이언트 : 2개받아서 더하는 메서드말고, 3개받아서  더하는ㅁ ㅔ서드도 만들어줘
		System.out.println(add(2,2,2));
		//클라이언트 : 3개말고 4개 
		System.out.println(add3(2,2,2,2));
		//================================메소드를 계속 만들어야하고 번거로움.
		// 오버로딩 : 같은 이름의 메서드를 만들되, 매개변수만 다르게.
		//==================================================
		System.out.println(add(2,2,2));
		System.out.println(add(3,3));  
		//자바에서는 메서드를 사용해야 할 때, 메서드명과 입력값 형태를 보고 필요한 메서드를 찾아감.
		//메서드명이 같아도 입력값이 다르면 ㄱㅊ      "메서드 오버로딩"
		
		System.out.println(5);
		System.out.println('A');
		System.out.println("문자열");
		
		// println은 자바에서 자체적으로 제공하는 메서드
		// 이때, println 또한 오버로딩 되어있음.
	}

}
