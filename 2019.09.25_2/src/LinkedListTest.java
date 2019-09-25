//끝에서부터 순차적으로//  추가삭제하는 경우는 ArrayList가 빠르지만,
//중간에 추가 또는 삭제할 경우는 앞뒤 정보만 변경하는 LinkedList가 더 빠르다.
//ArrayList는 뒤쪽 인덱스들을 모두 1씩 증가 또는 감소시키는 시간이 필요하여 처리 속도가 느림.
import java.util.*;
public class LinkedListTest {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++){
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 :" + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<10000;i++){
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 :" + (endTime - startTime) + "ns");
	}

}
