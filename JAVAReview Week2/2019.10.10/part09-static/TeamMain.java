package com.koreait.ex;

public class TeamMain {

	public static void main(String[] args) {
		Team member1 = new Team("ȫ�浿");
		Team member2 = new Team("ȫ���");
		Team member3 = new Team("ȫ����");
		
		member1.output();
		member2.output();

		System.out.println(Team.count);
	}

}
