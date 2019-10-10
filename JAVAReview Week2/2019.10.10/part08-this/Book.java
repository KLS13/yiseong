
public class Book {

	String title;
	String writer;
	int price;
	int salesVolume;
	boolean isBestSeller;
/*
	Book(String title, int price) {
		this.title = title;
		this.writer = "���ڹ̻�";
		this.price = price;
	}
	Book(String title, String writer, int price) {
		
		this(title,price);// �ݵ�� ���� ȣ���ؾ���.
		this.writer = writer;
	}
=====================================================================*/
	Book(String title, int price) {
		this(title, "���ڹ̻�", price);
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
		System.out.println("å ���� : " + title);
		System.out.println("å ���� : " + writer);
		System.out.println("å ���� : " + price);
		System.out.println("å �Ǹŷ� : " + salesVolume);
		System.out.println("����Ʈ ���� : " + (isBestSeller ? "����Ʈ ����" : "�Ϲݼ���"));
		System.out.println("=======================================================");
	}
	
}
