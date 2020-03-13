package test01;
//15세 이상 100만원/ 미만 50만원
// 3명이 여행갈때 비용과 고객 명단에 대한 출력--> 스트림으로 활용
//  고객명단 출력, 총비용, 20세 이상을 가나다순 , 람다식 
public class TravelCustomer {
	
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return name + "/" + age + "살/" + price + "원";
	}

}
