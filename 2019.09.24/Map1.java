import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		//Key값은 Integer, value값은 String인 맵을 만든다.
		
		//put = 데이터 삽입. 순서를 매기지 않음
		map.put(7, "son");
		map.put(10, "messi");
		map.put(21, "pirlo");
		//맵은 key값을 기준으로 데이터에 접근
		
		System.out.println(" no 7 : " + map.get(7)); //get을 할 때 키값을 넣어주면, 벨류를 반환
		System.out.println(" no 10 : " + map.get(10));
		System.out.println(" no 21 : " + map.get(21));
		/*
		 * 맵은 기본적으로 iterator 메소드 지원안함.  (반복적 접근 불가)
		 * 키값만 따로 모은 데이터를 만들 수 있따.
		 */
		
		
		//지울때도 키값 기준.
		map.remove(7);
		//데이터가 없을때 Null을 반환함.
		System.out.println("No7 :" + map.get(7));
		

	}

}
