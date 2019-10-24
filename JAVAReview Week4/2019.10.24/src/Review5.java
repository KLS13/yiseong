import java.util.*;

public class Review5 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(15);
		set.add(20);
		set.add(25);
		set.add(30);
		set.add(30);
		set.add(55);
		set.add(75);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
