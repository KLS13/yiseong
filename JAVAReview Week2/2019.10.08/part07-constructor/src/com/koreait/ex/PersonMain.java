package com.koreait.ex;

public class PersonMain {

	public static void main(String[] args) {
		
		Person woman = new Person("alice", 20, 168.5, '��');
		
		woman.output();
		
		// Person man = new Person(); �� ȣ���ϸ� ��� �Ǵ°�?
		// �����ڰ� �����ڸ� �ϳ���! �������� �ʾҴٸ� => �ڹٰ� ����Ʈ �����ڸ� ���� ȣ��
		// �����ڰ� �����ڸ� �ϳ���! �����ߴٸ� => Person() { } ������ �����ڰ� ������ ���� �߻�
		// ��! �����ڰ� �����ڸ� �����, �����ڰ� ���ϴ� ������θ�! ��ü�� ������ �� �ִ�.
		// Person man = new Person();
		
	}
	
}
