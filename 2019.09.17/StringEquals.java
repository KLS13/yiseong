public class StringEquals {
	// == 등가비교연산자로 비교하면 참조(메모리 주소)를 비교하는 것.
	//Object의 equals도 마찬가지

	public static void main(String[] args) {
		String str1 = new String("Love Java");
		String str2 = new String("Love Java");
		
		if(str1 == str2)
			System.out.println("Same ReFerence");
		else
			System.out.println("Different ReFerence");
		//문자열 클래스 내부에는 equals가 이미 재정되어 있다.
		if(str1.equals(str2))
			System.out.println("Same ReFerence");
		else
			System.out.println("Different ReFerence");

	}

}
