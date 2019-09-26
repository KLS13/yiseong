//이름을 키로 점수를 값으로 저장하기
import java.util.*;
public class HashMapTest1 {

	public static void main(String[] args) {
		//Map 컬렉션을 생성함
		
		Map<String, Integer>map = new HashMap<String, Integer>();
		
		//객체저장
		map.put("강이성", 85);
		map.put("홍길동", 95);  
		map.put("자바짱", 80);
		map.put("홍길동", 90); //"홍길동" 같은 키가 있어서 제일 마지막에 저장한 값으로 대치됨.
		System.out.println("총 엔트리 수 : " + map.size()); // 총 Entry수 얻기
		
		//객체찾기
		System.out.println("\t 홍길동 : " + map.get("홍길동")); // 이름으로 점수 검색
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet(); //key 얻기
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 엔트리 수 : " + map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+":" + value);
			//while~ :  반복해서 Map.Entry를 얻고 키와 값을 얻어냄.
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}

}
