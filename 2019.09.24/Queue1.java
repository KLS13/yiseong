import java.util.*;
//컬렉션 프레임워크 대부분은 util 패키지에서 제공된다 !
//큐 : First In, First Out ( 선착순 자료구조이다. )

public class Queue1 {

	public static void main(String[] args) {
		
		Queue<String> language = new LinkedList<>();
		/*연결기반 리스트를 "큐" 기반으로 사용하겠다 !
		 *
		 * LinkedList는 List 뿐만 아니라, Queue 인터페이스도 구현한 클래스다.
		 * 인터페이스는 다중 상속이 완전 가능!
		 */
		
		//offer : 데이터 삽입 (큐는 선형적 자료구조이므로, 순차적으로 쌓임)
		language.offer("Java");
		language.offer("C");
		language.offer("python");
		
		System.out.println("Next : " + language.peek()); // 내가 다음에 무엇을 뺄 수 있을지 확인
		System.out.println("OUT : " + language.poll()); // 빼버린다.
		System.out.println("Next : " + language.peek());
		System.out.println("OUT : " + language.poll());
		System.out.println("Next : " + language.peek());
		System.out.println("OUT : " + language.poll());
		System.out.println("Next : " + language.peek());
		System.out.println("OUT : " + language.poll());
		
	

	}

}


