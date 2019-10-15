package com.koreait.test;

class Employee{
	private String name;
	private String dept;
	
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	public int pay() {
		return 0;
	}
	public void output() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + dept);
	}
	
}
class SalaryWorker extends Employee {
	private int salary;
	
	public SalaryWorker(String name, String dept, int salary) {
		super(name,dept);
		this.salary = salary;
	}
	public int pay() {
		return salary;
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("월급 : " + pay());
	}
}
class PartTimeWorker extends Employee {
	private int workTime;
	private int payPerHour;
	
	public PartTimeWorker(String name, String dept, int workTime, int payPerHour) {
		super(name,dept);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}
	public int pay() {
		return workTime * payPerHour;
	}
	@Override
	public void output() {
		super.output();
		System.out.println("월급 : " + pay());
	}
}

public class Test01 {

	public static void main(String[] args) {
		
		Employee[] staffs = new Employee[3];
		
		// staffs[0] = new Employee("tom","홍보");
		staffs[0] = new SalaryWorker("alice", "디자인", 300);
		staffs[0].output();
		
		
		staffs[1] = new PartTimeWorker("james", "캐셔", 200, 1);
		staffs[1].output();
		
		
		if(staffs[0].pay() > staffs[1].pay()) {
			System.out.println("staffs[0]");
		}else {
			System.out.println("staffs[1]");	
			}
		
		}
	}
	
