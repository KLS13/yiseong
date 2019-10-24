import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Review4 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<5; i++) {
			System.out.print("과목 입력 >> ");
			String study = scanner.next();
			list.add(study);
		}
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
