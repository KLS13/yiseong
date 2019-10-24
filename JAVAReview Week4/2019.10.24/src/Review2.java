import java.util.Arrays;

class BookStore <T> {
	private T[] books;
	
	public BookStore(int capacity) {
		books = (T[])(new Object[capacity]);
	}
	
	public void add(T book) {
		for( int i =0 ; i<books.length; i++) {
			if(books[i] == null) { // books 빈자리에 저장 !!
				books[i] = book;
				break;
			}
		}
	}
	public T[] getBooks() {
		return books;
	}
}
class Info {
	private String title;
	
	public Info(String title) {
		this.title = title;
	}
	public String toString() {
		return title;
	}
}


public class Review2 {

	public static void main(String[] args) {
		BookStore<Info> book = new BookStore<>(5);
		
		book.add(new Info("자바짱"));
		book.add(new Info("JSP짱!"));
		book.add(new Info("스프링을 배우자!"));
		book.add(new Info("완성"));

		System.out.println(Arrays.toString(book.getBooks()));
	}

}
