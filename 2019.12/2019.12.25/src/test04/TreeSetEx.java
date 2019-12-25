package test04;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("자바", 96));
		treeSet.add(new Student("씨", 86));
		treeSet.add(new Student("파이썬", 92));
		
		Student student = treeSet.last();
		System.out.println("최고점수는 몇점인가요: " + student.score);
		System.out.println("최고점수를 받은 아이디는 ? : " + student.id);
	}
}
