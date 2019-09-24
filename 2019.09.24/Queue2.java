import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {

	public static void main(String[] args) {
		Queue<String> language = new LinkedList<>();
	
		//add element remove 같은 경우에는 요소가 없거나 데이터 저장 공간이 없을 시 예외 발생.
		//offer,peek poll 같은 경우에 위와 같은 상황일 경우 null 반환
		language.add("Java");
		language.add("C");
		language.add("python");
		
		System.out.println("Next : " + language.element()); // 내가 다음에 무엇을 뺄 수 있을지 확인
		System.out.println("OUT : " + language.remove()); // 빼버린다.
		System.out.println("Next : " + language.element());
		System.out.println("OUT : " + language.remove());
		System.out.println("Next : " + language.element());
		System.out.println("OUT : " + language.remove());
		System.out.println("Next : " + language.element());
		System.out.println("OUT : " + language.remove());
		
	

	}

}


