import java.util.*;

public class Stack2 {

	public static void main(String[] args) {
		//Deque<String> deq = new ArrayDeque<>();
		Deque<String> deq = new LinkedList<>();
		//LinkedList�� ���� �����Ѵٴ� ���� Ȯ��!
		
		//������ �ְ�
		deq.offerFirst("first");
		deq.offerFirst("second");
		deq.offerFirst("third");
		
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
	  //System.out.println(deq.pollFirst());
		
		
		

	}

}
