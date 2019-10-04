package com.koreait.test2;
// 3 6 9 °ÔÀÓ
// 1~99 »çÀÌ ÁøÇà    1 2 Â¦ 4 5 Â¦ 7 8 Â¦ 10
// 				11 12 Â¦ 14 15 Â¦ 17 18 Â¦ 20 21 22 Â¦
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
				System.out.print("Â¦" + "\t");
			}else if(count==2) {
				System.out.print("Â¦Â¦" + "\t");
			}else {
				System.out.print(i + "\t");
			}
			
			if(i%10==0) {
				System.out.println(" ");
			}
		}
		

	}

}
