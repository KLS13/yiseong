//String 객체를 중복없이 저장하는 Hash
import java.util.*;
public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("iBATIS");
		//java는 한번만 저장됨
		
		int size = set.size(); // 저장된 객체 수 얻음.
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> iterator = set.iterator(); //반복자 얻기
		while(iterator.hasNext()) { // 객체 수 만큼 
			String element = iterator.next(); // 한개의 객체를 가져옴.
			System.out.println("\t" + element);
		}
		set.remove("JDBC"); 
		set.remove("iBATIS");
		//각각의 객체 삭제
		
		System.out.println("총 객체수 : " + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.clear(); // 모든 객체를 제거하고 비움
		if(set.isEmpty()) { 
			System.out.println("비어있음");
		}
	}	
}
