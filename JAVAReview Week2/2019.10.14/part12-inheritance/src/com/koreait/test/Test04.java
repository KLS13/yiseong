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
		// �� ���� ����!
		return 0;
	}
	*/
	void output() {
		System.out.println("�̸� : " + name);
		System.out.println("�μ� : " + dept);
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
		System.out.println("���� : " + pay());
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
		return (int)(salary * salesIncentive);		// ���� = �⺻�� * �Ǹ� �μ�Ƽ��
	}
	@Override
	int pay() {
		return salary + salesPay();					// �⺻�� + ����
	}
	@Override
	void output() {
		super.output();
		System.out.println("���� : " + salesPay());
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
		System.out.println("���� : " + pay());
	}
	
}

public class Test04 {

	public static void main(String[] args) {

		SalaryWorker salaryMan = new SalaryWorker("����ȣ", "ȫ��", 300);
		SalesWorker salesMan = new SalesWorker("���¿�", "�ѹ�", 300, 0.1);
		PartTimeWorker albaMan = new PartTimeWorker("äġ��", "�Ǹ�", 209, 10000);
		
		salaryMan.output();
		salesMan.output();
		albaMan.output();
		
	}

}