public class Local {

	// Field
	String name;
	int age;
	String sn;
	boolean isKorean;
	
	// Constructor
	Local(String name, int age) {
		this(name, age, null);
	}
	Local(String name, int age, String sn) {
		this.name = name;
		this.age = age;
		this.sn = sn;
		if (sn != null) {
			this.isKorean = sn.charAt(7) <= '4' ? true : false;
		}
	}
	
	// Method
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민등록번호 : " + (sn == null ? "없음" : sn));
		System.out.println(isKorean ? "한국인" : "외국인");
	}
	
}
