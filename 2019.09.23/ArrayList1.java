import java.util.*;
/*
 * ArrayList : 배열 기반의 리스트
 * LinkedList : 연결 기반의 리스트(요소가 추가될 때마다 공간을 동적 할당)
 * 기능면에서는 두 리스트가 별반 차이가 없다.
 * 상황에 따른 차이는 존재한다.
 */
public class ArrayList1 {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<>();
		//배열 기반의 리스트
		
		a1.add("Toy");
		a1.add("Box");
	    a1.add("Robot");
	    //저장 순서는 유지된다
	    
	    //arr.length < -- > ArrayList.size()
	    for(int i = 0 ; i < a1.size(); i++) {
	    	System.out.print(a1.get(i) + " ");
	    
	    } // get(i) : i번 요소를 반환할거다.
	    
	    System.out.println("");

	    a1.remove(0); // 0번 요소를 지울 것이다.
	   
	    for(int i = 0 ; i < a1.size(); i++) {
	    	System.out.print(a1.get(i)+ "");
	    }
	}

}
