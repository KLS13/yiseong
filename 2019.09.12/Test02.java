//책을 의미하는 book  클래스와  전자책 ebook
//전자책도 책의 일종   
//다음형태의 상속관계구현
class Book{
	private String title; // 책 제목
	private String isbn; // 도서 번호
	private int price; // 가격
	
	Book(String title, String isbn, int price){
		this.title=title;
		this.isbn=isbn;
		this.price=price;
	}
	void ShowBookInfo() {
		System.out.println("제목은"  + title);
		System.out.println("도서번호는"  + isbn);
		System.out.println("가격은"  + price);
	}
}

class Ebook extends Book{

	private String DRMKey;// 보안 관련 키
	Ebook(String title, String isbn, int price, String DRMKey){
		super(title,isbn,price);
		this.DRMKey = DRMKey;
		
	
	}
	void ShowBookInfo() {
		super.ShowBookInfo();
		System.out.println("인증키" + DRMKey);
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
