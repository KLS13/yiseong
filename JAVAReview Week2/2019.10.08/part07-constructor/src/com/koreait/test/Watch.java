package com.koreait.test;

public class Watch {

		int hour;
		int minute;
		int second;
		
		Watch(int h, int m, int s) {
			hour = h;
			minute = m;
			second = s;
		}
		
		void setHour(int h) {
			if( h<0) { //h�� 0���� ������ ���x
				return ;
			}
			hour = h % 24;
		}
		void setMinute(int m) {
			if(m<0) {
				return;
			}
			hour += (m/60); // 0~23������ ����� hour �߻� ����
			setHour(hour);  // ���� ����
			
			minute = m%60;
		}
		void setSecond(int s) {
			if(s<0) {
				return;
			}
			hour += (s/3600);
			setHour(hour);
			minute += (s%3600/60);
			setMinute(minute);
			
			second = s%60;
		}
		void see() {
			System.out.println(hour + "�� " +minute + "�� " + second + "��");
		}

	}

