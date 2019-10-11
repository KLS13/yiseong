package com.koreait.test;

import java.util.Scanner;

public class WeekScheduler {

	// Field
	Day[] days;
	Scanner scanner;
	String[] week = {"일", "월", "화", "수", "목", "금", "토"};
	
	// Constructor
	WeekScheduler() {
		days = new Day[7];			// 1) 7개의 참조변수를 준비하라!
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();	// 2) 7개의 Day를 생성하라!
		}
		scanner = new Scanner(System.in);
	}
	
	// Method
	void makeSchedule() {
		
		System.out.print("스케쥴 등록할 요일(일~토) >> ");		// 1) 스케쥴 등록할 요일을 입력 받는다.
		String weekday = scanner.next();
		
		for (int i = 0; i < week.length; i++) {					// 2) 요일에 해당하는 스케쥴 저장 위치 찾기
			if (weekday.equals(week[i])) {
				if (days[i].getSchedule() == null) {			// 3) 해당 요일에 기존 스케쥴이 있는지 확인
					System.out.print("등록할 스케쥴 입력 >> ");	// 4) 등록할 스케쥴을 입력 받는다.
					String schedule = scanner.next();
					days[i].setSchedule(schedule);				// 5) 스케쥴을 days 배열에 저장한다.
				} else {
					System.out.println(week[i] + "요일은 이미 스케쥴이 있습니다.");
				}
			}
		}
		
	}
	void removeSchedule() {
		
		System.out.print("스케쥴 삭제할 요일(일~토) >> ");		// 1) 스케쥴 삭제할 요일을 입력 받는다.
		String weekday = scanner.next();
		
		for (int i = 0; i < week.length; i++) {					// 2) 요일에 해당하는 스케쥴 저장 위치 찾기
			if (weekday.equals(week[i])) {
				if (days[i].getSchedule() == null) {			// 3) 해당 요일에 기존 스케쥴이 있는지 확인
					System.out.println(week[i] + "요일은 삭제할 스케쥴이 없습니다.");
				} else {
					days[i].setSchedule(null);					// 4) 해당 요일의 스케쥴을 삭제한다.
				}
			}
		}
		
	}
	void modifySchedule() {
		
		System.out.print("스케쥴 수정할 요일(일~토) >> ");		// 1) 스케쥴 수정할 요일을 입력 받는다.
		String weekday = scanner.next();
		
		for (int i = 0; i < week.length; i++) {					// 2) 요일에 해당하는 스케쥴 저장 위치 찾기
			if (weekday.equals(week[i])) {
				if (days[i].getSchedule() == null) {			// 3) 해당 요일에 기존 스케쥴이 있는지 확인
					System.out.println(week[i] + "요일은 스케쥴이 없습니다.");
					System.out.print("새 스케쥴을 등록하겠습니까?(yes/no) >> ");	// 4) 새 스케쥴 등록 여부를 입력 받는다.
					String yesNo = scanner.next();
					if (yesNo.equalsIgnoreCase("yes")) {							// 5) 새 스케쥴을 등록한다.
						System.out.print("등록할 스케쥴 입력 >> ");
						String schedule = scanner.next();
						days[i].setSchedule(schedule);
					} else {														// 6) 새 스케쥴을 등록하지 않겠다.
						System.out.println("변경된 스케쥴이 없습니다.");
					}
				} else {
					System.out.println(week[i] + "요일의 기존 스케쥴을 변경합니다.");
					System.out.print("변경할 스케쥴 입력 >> ");						// 7) 새로운 스케쥴로 기존 스케쥴을 변경한다.
					String schedule = scanner.next();
					days[i].setSchedule(schedule);
				}
			}
		}
		
	}
	void output() {
		System.out.println("일주일의 전체 스케쥴 출력");
		for (int i = 0; i < days.length; i++) {
			System.out.print(week[i] + "요일 스케쥴 = ");
			days[i].output();
		}
	}
	void exit() {
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}
	void menu() {
		System.out.println();
		System.out.println("1. 스케쥴 만들기");
		System.out.println("2. 스케쥴 없애기");
		System.out.println("3. 스케쥴 바꾸기");
		System.out.println("4. 스케쥴 보기");
		System.out.println("0. 종료하기");
		System.out.println();
	}
	void run() {
		while (true) {
			menu();
			System.out.print("메뉴 선택 >> ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: makeSchedule();	break;
			case 2: removeSchedule(); break;
			case 3: modifySchedule(); break;
			case 4: output(); break;
			case 0: exit(); return;		// run 메소드의 종료
			default: System.out.println("없는 메뉴입니다. 다시 입력하세요.");
			}
		}
	}
	
}
