import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Review3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i<=10; i++) {
		list.add(i*10);
		}
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
