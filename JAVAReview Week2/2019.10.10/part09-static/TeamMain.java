package com.koreait.ex;

public class TeamMain {

	public static void main(String[] args) {
		Team member1 = new Team("È«±æµ¿");
		Team member2 = new Team("È«±æ¼ø");
		Team member3 = new Team("È«±æÀÚ");
		
		member1.output();
		member2.output();

		System.out.println(Team.count);
	}

}
