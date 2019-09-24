import java.util.HashMap;
import java.util.Set;

public class Map2 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		//--> 트리맵으로 바꾸면 킥밧의 정렬이 포함된다.
		
		//put = 데이터 삽입. 순서를 매기지 않음
		map.put(7, "son");
		map.put(10, "messi");
		map.put(21, "pirlo");
		//맵은 key값을 기준으로 데이터에 접근
		Set<Integer> ks = map.keySet();
		//key만 모여있는 집합(set)을 반환
		//중복허용 안되고, 순서도 안매김
		
		for(Integer i : ks) {
			System.out.print(i + "\t");
			
		}
		System.out.println("");
		for(Integer i : ks) {
			System.out.print(map.get(i) + "\t");
		}
	}

}
