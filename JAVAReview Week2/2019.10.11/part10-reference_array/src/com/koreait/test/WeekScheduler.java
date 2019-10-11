package com.koreait.test;

import java.util.Scanner;

public class WeekScheduler {

	// Field
	Day[] days;
	Scanner scanner;
	String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};
	
	// Constructor
	WeekScheduler() {
		days = new Day[7];			// 1) 7���� ���������� �غ��϶�!
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();	// 2) 7���� Day�� �����϶�!
		}
		scanner = new Scanner(System.in);
	}
	
	// Method
	void makeSchedule() {
		
		System.out.print("������ ����� ����(��~��) >> ");		// 1) ������ ����� ������ �Է� �޴´�.
		String weekday = scanner.next();
		
		for (int i = 0; i < week.length; i++) {					// 2) ���Ͽ� �ش��ϴ� ������ ���� ��ġ ã��
			if (weekday.equals(week[i])) {
				if (days[i].getSchedule() == null) {			// 3) �ش� ���Ͽ� ���� �������� �ִ��� Ȯ��
					System.out.print("����� ������ �Է� >> ");	// 4) ����� �������� �Է� �޴´�.
					String schedule = scanner.next();
					days[i].setSchedule(schedule);				// 5) �������� days �迭�� �����Ѵ�.
				} else {
					System.out.println(week[i] + "������ �̹� �������� �ֽ��ϴ�.");
				}
			}
		}
		
	}
	void removeSchedule() {
		
		System.out.print("������ ������ ����(��~��) >> ");		// 1) ������ ������ ������ �Է� �޴´�.
		String weekday = scanner.next();
		
		for (int i = 0; i < week.length; i++) {					// 2) ���Ͽ� �ش��ϴ� ������ ���� ��ġ ã��
			if (weekday.equals(week[i])) {
				if (days[i].getSchedule() == null) {			// 3) �ش� ���Ͽ� ���� �������� �ִ��� Ȯ��
					System.out.println(week[i] + "������ ������ �������� �����ϴ�.");
				} else {
					days[i].setSchedule(null);					// 4) �ش� ������ �������� �����Ѵ�.
				}
			}
		}
		
	}
	void modifySchedule() {
		
		System.out.print("������ ������ ����(��~��) >> ");		// 1) ������ ������ ������ �Է� �޴´�.
		String weekday = scanner.next();
		
		for (int i = 0; i < week.length; i++) {					// 2) ���Ͽ� �ش��ϴ� ������ ���� ��ġ ã��
			if (weekday.equals(week[i])) {
				if (days[i].getSchedule() == null) {			// 3) �ش� ���Ͽ� ���� �������� �ִ��� Ȯ��
					System.out.println(week[i] + "������ �������� �����ϴ�.");
					System.out.print("�� �������� ����ϰڽ��ϱ�?(yes/no) >> ");	// 4) �� ������ ��� ���θ� �Է� �޴´�.
					String yesNo = scanner.next();
					if (yesNo.equalsIgnoreCase("yes")) {							// 5) �� �������� ����Ѵ�.
						System.out.print("����� ������ �Է� >> ");
						String schedule = scanner.next();
						days[i].setSchedule(schedule);
					} else {														// 6) �� �������� ������� �ʰڴ�.
						System.out.println("����� �������� �����ϴ�.");
					}
				} else {
					System.out.println(week[i] + "������ ���� �������� �����մϴ�.");
					System.out.print("������ ������ �Է� >> ");						// 7) ���ο� ������� ���� �������� �����Ѵ�.
					String schedule = scanner.next();
					days[i].setSchedule(schedule);
				}
			}
		}
		
	}
	void output() {
		System.out.println("�������� ��ü ������ ���");
		for (int i = 0; i < days.length; i++) {
			System.out.print(week[i] + "���� ������ = ");
			days[i].output();
		}
	}
	void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		scanner.close();
	}
	void menu() {
		System.out.println();
		System.out.println("1. ������ �����");
		System.out.println("2. ������ ���ֱ�");
		System.out.println("3. ������ �ٲٱ�");
		System.out.println("4. ������ ����");
		System.out.println("0. �����ϱ�");
		System.out.println();
	}
	void run() {
		while (true) {
			menu();
			System.out.print("�޴� ���� >> ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: makeSchedule();	break;
			case 2: removeSchedule(); break;
			case 3: modifySchedule(); break;
			case 4: output(); break;
			case 0: exit(); return;		// run �޼ҵ��� ����
			default: System.out.println("���� �޴��Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}
	
}
