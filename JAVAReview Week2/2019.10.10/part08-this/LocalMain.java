public class LocalMain {

	public static void main(String[] args) {
		
		Local person1 = new Local("홍길동", 20, "901215-1234567");
		Local person2 = new Local("응우엔티엔", 21, "911215-6789123");
		Local person3 = new Local("james", 22);
		
		person1.output();	System.out.println("-----");
		person2.output();	System.out.println("-----");
		person3.output();
		
	}
	
}
