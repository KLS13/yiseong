package com.koreait.test;

class Employee {
	
	// Field
	String name;
	String dept;
	
	// Constructor
	Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	// Method
	/*
	int pay() {
		// 할 일이 없다!
		return 0;
	}
	*/
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + dept);
	}
	
}

class SalaryWorker extends Employee {
	
	// Field
	int salary;
	
	// Constructor
	SalaryWorker(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}
	
	// Method
	int pay() {
		return salary;
	}
	@Override
	void output() {
		super.output();
		System.out.println("월급 : " + pay());
	}
	
}

class SalesWorker extends SalaryWorker {
	
	// Field
	double salesIncentive;
	
	// Constructor
	SalesWorker(String name, String dept, int salary, double salesIncentive) {
		super(name, dept, salary);
		this.salesIncentive = salesIncentive;
	}
	
	// Method
	int salesPay() {
		return (int)(salary * salesIncentive);		// 수당 = 기본급 * 판매 인센티브
	}
	@Override
	int pay() {
		return salary + salesPay();					// 기본급 + 수당
	}
	@Override
	void output() {
		super.output();
		System.out.println("수당 : " + salesPay());
	}
	
}

class PartTimeWorker extends Employee {
	
	// Field
	int workTime;
	int payPerHour;
	
	// Constructor
	PartTimeWorker(String name, String dept, int workTime, int payPerHour) {
		super(name, dept);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}
	
	// Method
	int pay() {
		return workTime * payPerHour;
	}
	@Override
	void output() {
		super.output();
		System.out.println("월급 : " + pay());
	}
	
}

public class Test04 {

	public static void main(String[] args) {

		SalaryWorker salaryMan = new SalaryWorker("강백호", "홍보", 300);
		SalesWorker salesMan = new SalesWorker("서태웅", "총무", 300, 0.1);
		PartTimeWorker albaMan = new PartTimeWorker("채치수", "판매", 209, 10000);
		
		salaryMan.output();
		salesMan.output();
		albaMan.output();
		
	}

}