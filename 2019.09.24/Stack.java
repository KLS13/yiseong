import java.util.*;

//�̰��� �� !
public class Stack {

	public static void main(String[] args) {
		//���� �ڹٿ����� Stack Ŭ������ ������� �ʴ´�.
		//��ſ� �װ��� ��ü�ϴ� ���𰡸� ���
		
		//Stack�� ��ü�ϴ� �ٸ� �ڷᱸ�� --> ��(Deque)
		Deque<Integer> deq = new ArrayDeque<>();
		
		deq.offerFirst(2);
		deq.offerFirst(1);
		System.out.println("Next :" + deq.peekFirst());
		//���� �տ� �ִ� ���� Ȯ���ϴ� peekFirst  (1)
		System.out.println("Out! :" + deq.pollFirst()); // ������
		//�� 2 3 4 ��
		
		deq.offerLast(3);
		deq.offerLast(4);
		System.out.println("Next :" + deq.peekLast());
		//���� �ڿ��ִ°��� Ȯ���ϴ� peekLast (4)
		System.out.println("Out! :" + deq.pollLast());
		//�� 2 3 ��

		System.out.println("���� ������ : ");  // �� 2 3 ��   ( 2 , 3 ���� )
		for(Integer i : deq) {
			System.out.println(i + " ");
		}
	}
	// offer peek pool �� null ��ȯ
	//add, remove, get �� ���ܹ߻�
	

}
