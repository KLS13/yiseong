package singletonPattern;

public class Company {

	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() { // 외부에서 호출하기위해 static
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
