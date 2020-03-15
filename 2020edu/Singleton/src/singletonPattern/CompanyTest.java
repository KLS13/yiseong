package singletonPattern;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company = Company.getInstance();
		Company company2 = Company.getInstance();
	
		System.out.println(company); //동일한 주소
		System.out.println(company2); // 100번불러도 동일

		Calendar calendar = Calendar.getInstance(); // 싱글톤패턴 객체
		

	}

}
