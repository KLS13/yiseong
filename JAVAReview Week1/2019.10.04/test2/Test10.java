package com.koreait.test2;
// 3 6 9 ����
// 1~99 ���� ����    1 2 ¦ 4 5 ¦ 7 8 ¦ 10
// 				11 12 ¦ 14 15 ¦ 17 18 ¦ 20 21 22 ¦
public class Test10 {

	public static void main(String[] args) {
		int first, second;
			
		for(int i=1; i <=99; i++) {
			int count = 0;
			
			first = i/10;
			second = i%10;
			
			
			if(first==3 || first==6 || first ==9){
				count++;
			}
			if(second ==3 || second ==6 || second ==9) {
				count++;
			}
			
			if(count==1) {
				System.out.print("¦" + "\t");
			}else if(count==2) {
				System.out.print("¦¦" + "\t");
			}else {
				System.out.print(i + "\t");
			}
			
			if(i%10==0) {
				System.out.println(" ");
			}
		}
		

	}

}
