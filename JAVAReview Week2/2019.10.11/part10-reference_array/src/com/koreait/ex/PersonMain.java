package com.koreait.ex;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Person[] people = new Person[3];
		//people : ��������
		//0x10: people[0],people[1], people[2]

		for(int i=0; i<people.length;i++) {
			people[i] = new Person();
		}
		
		people[0].name = "ȫ�浿";
		people[0].age = 20;
		people[0].height = 168.5;
		people[0].gender = '��';
		
		people[0].output();

	}

}
