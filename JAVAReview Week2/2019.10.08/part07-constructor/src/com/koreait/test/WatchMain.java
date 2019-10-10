package com.koreait.test;

public class WatchMain {

	public static void main(String[] args) {
		
		Watch watch = new Watch(9,25,0);
		watch.see();
		
		watch.setHour(25);
		watch.setMinute(61);
		watch.setSecond(3661);
		
		watch.see();

	}

}
