package test04;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("�ڹ�", 96));
		treeSet.add(new Student("��", 86));
		treeSet.add(new Student("���̽�", 92));
		
		Student student = treeSet.last();
		System.out.println("�ְ������� �����ΰ���: " + student.score);
		System.out.println("�ְ������� ���� ���̵�� ? : " + student.id);
	}
}
