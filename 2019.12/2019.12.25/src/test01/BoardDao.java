package test01;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("제목임ㅋ", "자바임"));
		list.add(new Board("제목2임ㅋ", "파이썬임"));
		list.add(new Board("제목3임ㅋ", "플러터임"));
		return list;
	}
}
