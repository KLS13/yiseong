import java.util.*;
//�÷��� �����ӿ�ũ ��κ��� util ��Ű������ �����ȴ� !
//ť : First In, First Out ( ������ �ڷᱸ���̴�. )

public class Queue1 {

	public static void main(String[] args) {
		
		Queue<String> language = new LinkedList<>();
		/*������ ����Ʈ�� "ť" ������� ����ϰڴ� !
		 *
		 * LinkedList�� List �Ӹ� �ƴ϶�, Queue �������̽��� ������ Ŭ������.
		 * �������̽��� ���� ����� ���� ����!
		 */
		
		//offer : ������ ���� (ť�� ������ �ڷᱸ���̹Ƿ�, ���������� ����)
		language.offer("Java");
		language.offer("C");
		language.offer("python");
		
		System.out.println("Next : " + language.peek()); // ���� ������ ������ �� �� ������ Ȯ��
		System.out.println("OUT : " + language.poll()); // ��������.
		System.out.println("Next : " + language.peek());
		System.out.println("OUT : " + language.poll());
		System.out.println("Next : " + language.peek());
		System.out.println("OUT : " + language.poll());
		System.out.println("Next : " + language.peek());
		System.out.println("OUT : " + language.poll());
		
	

	}

}


