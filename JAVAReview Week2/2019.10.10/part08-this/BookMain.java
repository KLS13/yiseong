
public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("��������", 10000);
		Book book2 = new Book("�ڹ��� ����" , "���ü�", 35000);
		
		book1.setSalesVolume(500);
		book2.setSalesVolume(1500);
		
		book1.output();
		book2.output();

	}

}
