import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

//정렬 알고리즘을 내림차순으로 만들어 트리맵에 삽입하자.
//Comparator 인터페이스의 compare를 재정의.
class IntegerComparator implements Comparator<Integer> {
	public int compare(Integer n1, Integer n2) {
		return n2.intValue() - n1.intValue();
		//n1은 기존의 데이터, n2는 새로 들어온 데이터
	}
}

public class Map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<>(new IntegerComparator());  
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
