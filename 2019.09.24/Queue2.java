import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {

	public static void main(String[] args) {
		Queue<String> language = new LinkedList<>();
	
		//add element remove ���� ��쿡�� ��Ұ� ���ų� ������ ���� ������ ���� �� ���� �߻�.
		//offer,peek poll ���� ��쿡 ���� ���� ��Ȳ�� ��� null ��ȯ
		language.add("Java");
		language.add("C");
		language.add("python");
		
		System.out.println("Next : " + language.element()); // ���� ������ ������ �� �� ������ Ȯ��
		System.out.println("OUT : " + language.remove()); // ��������.
		System.out.println("Next : " + language.element());
		System.out.println("OUT : " + language.remove());
		System.out.println("Next : " + language.element());
		System.out.println("OUT : " + language.remove());
		System.out.println("Next : " + language.element());
		System.out.println("OUT : " + language.remove());
		
	

	}

}


