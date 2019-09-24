import java.util.*;

//이것은 덱 !
public class Stack {

	public static void main(String[] args) {
		//요즘 자바에서는 Stack 클래스를 사용하지 않는다.
		//대신에 그것을 대체하는 무언가를 사용
		
		//Stack을 대체하는 다른 자료구조 --> 덱(Deque)
		Deque<Integer> deq = new ArrayDeque<>();
		
		deq.offerFirst(2);
		deq.offerFirst(1);
		System.out.println("Next :" + deq.peekFirst());
		//가장 앞에 있는 것을 확인하는 peekFirst  (1)
		System.out.println("Out! :" + deq.pollFirst()); // 꺼내기
		//앞 2 3 4 뒤
		
		deq.offerLast(3);
		deq.offerLast(4);
		System.out.println("Next :" + deq.peekLast());
		//가장 뒤에있는것을 확인하는 peekLast (4)
		System.out.println("Out! :" + deq.pollLast());
		//앞 2 3 뒤

		System.out.println("남은 데이터 : ");  // 앞 2 3 뒤   ( 2 , 3 남음 )
		for(Integer i : deq) {
			System.out.println(i + " ");
		}
	}
	// offer peek pool 은 null 반환
	//add, remove, get 은 예외발생
	

}
