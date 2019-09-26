//학번과 이름이 동일한 경우 같은 키로 인식
import java.util.*;

public class HashMapTest2 {

	public static void main(String[] args) {
		Map<Student, Integer>map = new HashMap<Student, Integer>();
		
		map.put(new Student(1,"홍길동"), 95);
		map.put(new Student(1,"홍길동"), 95);
		//학번과 이름이 동일한 Student를 키로 저장
		
		System.out.println("총 앤트리 수 : " + map.size());

	}

}
