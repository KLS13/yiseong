import java.util.*;
//정렬 : 일정한 규칙에 의해서 열거된 형태
// -> 오름차순, 내림차순, 알파벳순, 가나다순, 등등
//트리셋은 기존의 셋에 정렬 기능이 추가된 것
//트리도 하나의 자료구조이다.



//Comparator 비교에 대한 기능을 정의하도록 하는 인터페이스
class IntegerComparator implements Comparator<Integer> {
	public int compare(Integer n1, Integer n2) {
		return n2.intValue() - n1.intValue();
	}
}
// n1 은 기존데이터 중 마지막에 들어가있는
// n2 는 이제 들어오는   ex) 1 2 3 4   -->   4 가 n1  ,  5가 들어가려고하면  5는 n2
                  // n1 - n2 = 4 - 5 = -1  음수,  compare 반환값이 음수면, 순서를 유지한다
                  // compare 반환값이 양수면, 순서를 뒤집는다.
 				  // 중복을 허용하지않지만,  0 일 경우에는 순서를 유지한다.

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> ts = new TreeSet<>(new IntegerComparator());
		
		ts.add(3);
		ts.add(1);
		ts.add(2);
		ts.add(4);
		// 3-1-2-4  기본적으로 트리셋은 오름차순 정렬
		
		Iterator it = ts.iterator();
		System.out.println("<TreeSet>출력 : ");
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		System.out.println("\n 현재 TreeSet의 크기 : " + ts.size());  //size : 요소의 개수
	}

}
