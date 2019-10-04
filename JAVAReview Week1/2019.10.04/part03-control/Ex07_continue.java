package com.koreait.ex;

public class Ex07_continue {

	public static void main(String[] args) {
		/*
		 형식
		 
		 	while(조건식) {
		 		반복실행문;
		 		if(조건식) {
		 		continue;
		 		}
		 		반복실행문;
		 		}
		 		
		  	for(초기문; 조건식; 반복실행문 후 실행) {
		  	반복실핼문;
		  	if(조건식) {
		  	continue;
		  	}
		  	반복실행문;
		  	}
		 ex)
		 while(다 먹을때까지 ){
		 	반찬을 집어라!
		 	if(반찬 == 굴) {
		 		continue;
		 	}
		 	반찬을 먹는다 !
		 	}
		 	
		 	특징
		 	반복에서 제외하고 싶은 데이터를 조건식으로 만들고 continue;
		 	while for문 계열에 약간의 차이가 있음.
		 */
		int num = 0;
		while (num <10) {
			num++;
			if(num%3==0) {
				continue;
			}
			
			System.out.println(num);
			
		}
		System.out.println("==================================================");
		for(num=1; num<=10; num++) {
			if(num%3==0) {
				continue;
			}
			System.out.println(num);
		}

	}

}
