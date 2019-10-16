package com.koreait.ex;

abstract class Employee {
	private String name;
	private String dept;
	
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public void output() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + dept);
	}
	abstract public int pay() ;
}
class SalaryWorker extends Employee {
	
	private int salary;
	
	public SalaryWorker(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void output() {
		super.output();
		System.out.println("기본급 : " + salary);
	}
	@Override
	public int pay() {
		return salary;
	}
}

class SalesWorker extends SalaryWorker {
	
	
	private int salesVolume;
	private double salesIncentive;
	
	public SalesWorker(String name, String dept, int salary) {
		super(name, dept, salary);
	}

	public int getSalesVolume() {
		return salesVolume;
	}

	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
		if(salesVolume >= 1000) {
			setSalesIncentive(0.1);
		}else if(salesVolume >= 500) {
			setSalesIncentive(0.05);
		}else {
			setSalesIncentive(0.01);
		}
	}

	public double getSalesIncentive() {
		return salesIncentive;
	}

	public void setSalesIncentive(double salesIncentive) {
		this.salesIncentive = salesIncentive;
	}
	public int salesPay() {
		return (int)(salesVolume * salesIncentive);
	}
	@Override
	public int pay() {
		return super.pay() + salesPay();
	}
	@Override
	public void output() {
		super.output();
		System.out.println("판매수당 : " + salesPay());
		System.out.println("월급 : " + pay());
	}	
}

public class Ex02_abstract {

	public static void main(String[] args) {
		Employee[] staffs = new Employee[2];
		
		staffs[0] = new SalaryWorker("Alice", "디자인", 300);
		staffs[0].output();
		
		staffs[1] = new SalesWorker("james","영업",300);
		((SalesWorker)staffs[1]).setSalesVolume(1000);
		staffs[1].output();

	}

}
