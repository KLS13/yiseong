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
			if( h<0) { //h가 0보다 작으면 사용x
				return ;
			}
			hour = h % 24;
		}
		void setMinute(int m) {
			if(m<0) {
				return;
			}
			hour += (m/60); // 0~23범위를 벗어나는 hour 발생 가능
			setHour(hour);  // 범위 조정
			
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
			System.out.println(hour + "시 " +minute + "분 " + second + "초");
		}

	}

