
public class Book {

	String title;
	String writer;
	int price;
	int salesVolume;
	boolean isBestSeller;
/*
	Book(String title, int price) {
		this.title = title;
		this.writer = "작자미상";
		this.price = price;
	}
	Book(String title, String writer, int price) {
		
		this(title,price);// 반드시 먼저 호출해야함.
		this.writer = writer;
	}
=====================================================================*/
	Book(String title, int price) {
		this(title, "작자미상", price);
	}
	Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	
	void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
		if(salesVolume >= 1000) {
			isBestSeller = true;
		}else {
			isBestSeller = false;
		}
	}
	void output() {
		System.out.println("책 제목 : " + title);
		System.out.println("책 저자 : " + writer);
		System.out.println("책 가격 : " + price);
		System.out.println("책 판매량 : " + salesVolume);
		System.out.println("베스트 셀러 : " + (isBestSeller ? "베스트 셀러" : "일반서적"));
		System.out.println("=======================================================");
	}
	
}
