package com.koreait.test;
import java.util.Scanner;
import com.koreait.ex.Triangle;

public class CircleMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle[] cir = new Circle[3];
		
		for(int i=0; i<cir.length; i++) {
			System.out.print("반지름 입력 >> ");
			cir[i] = new Circle(scanner.nextDouble()); 
		}
		double maxArea = cir[0].calcArea();
		int idxOfMaxArea = 0;
		for(int i = 1; i < cir.length;i++) {
			if(maxArea <= cir[i].calcArea()) {
				maxArea = cir[i].calcArea();
				idxOfMaxArea = i;
			}
		}
		cir[idxOfMaxArea].output();
		scanner.close();
	}

}

