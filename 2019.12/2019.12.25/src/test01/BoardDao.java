package test01;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("�����Ӥ�", "�ڹ���"));
		list.add(new Board("����2�Ӥ�", "���̽���"));
		list.add(new Board("����3�Ӥ�", "�÷�����"));
		return list;
	}
}
