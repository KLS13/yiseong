//å�� �ǹ��ϴ� book  Ŭ������  ����å ebook
//����å�� å�� ����   
//���������� ��Ӱ��豸��
class Book{
	private String title; // å ����
	private String isbn; // ���� ��ȣ
	private int price; // ����
	
	Book(String title, String isbn, int price){
		this.title=title;
		this.isbn=isbn;
		this.price=price;
	}
	void ShowBookInfo() {
		System.out.println("������"  + title);
		System.out.println("������ȣ��"  + isbn);
		System.out.println("������"  + price);
	}
}

class Ebook extends Book{

	private String DRMKey;// ���� ���� Ű
	Ebook(String title, String isbn, int price, String DRMKey){
		super(title,isbn,price);
		this.DRMKey = DRMKey;
		
	
	}
	void ShowBookInfo() {
		super.ShowBookInfo();
		System.out.println("����Ű" + DRMKey);
	}
	
}
public class Test02 {

	public static void main(String[] args) {
		
		Book book = new Book("YOON'S JAVA","5555-5555",15000);
		book.ShowBookInfo();
		
		Ebook eb = new Ebook("YOON'S JAVA","5555-5555",15000,"444-55");
		eb.ShowBookInfo();
		

	}

}
