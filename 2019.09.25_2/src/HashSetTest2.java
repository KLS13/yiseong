//Member 객체를 중복없이 저장
import java.util.*;
public class HashSetTest2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));

		System.out.println("총 객체수 : " + set.size());

	}

}
