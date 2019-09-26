//영어 단어를 정렬하고, 범위 검색해보기
import java.util.*;
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("forever");
		treeSet.add("ever");
		treeSet.add("description");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("cherry");
		
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}

}
