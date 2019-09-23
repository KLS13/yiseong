import java.util.*;
//해쉬셋 기본예제
// 1. 순서를 매기지 않음 (저장 순서 유지하지 않음)
// 2. 중복을 허용하지 않음. (같은 데이터 들어오면 저장하지 않음)
public class Hashset1 {

	public static void main(String[] args) {
		//제네릭 기반이다.
		HashSet<String> set = new HashSet<>();
		
		//add : 요소 추가하기
		set.add("Toy");
		set.add("Story");
		set.add("Fun");
		set.add("Fun"); //중복이므로 들어가지않음
		//중복 판단 기준
		// hashcode() 를 본다.
		// equals() 를 본다
		Iterator<String> itr = set.iterator(); // 열거형 데이터를 만드는 Iterator! 제네릭 기반
		//set.iterator() : set의 멤버를 열거형으로 반환한다.
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} // hasNext() : 읽을 데이터가 있으면 true 반환
		  // next : 데이터 읽어들이기 !
		  // 읽을 데이터가 없을 때까지 읽기.
		for(String s : set) {
			System.out.println(s);
		} // for-each문
		
		int[] arr = new int[5];
		for(int i : arr) {
			System.out.println(arr[i]);
		}

	}

}
