package com.koreait.ex;

public class Ex07_continue {

	public static void main(String[] args) {
		/*
		 ����
		 
		 	while(���ǽ�) {
		 		�ݺ����๮;
		 		if(���ǽ�) {
		 		continue;
		 		}
		 		�ݺ����๮;
		 		}
		 		
		  	for(�ʱ⹮; ���ǽ�; �ݺ����๮ �� ����) {
		  	�ݺ����۹�;
		  	if(���ǽ�) {
		  	continue;
		  	}
		  	�ݺ����๮;
		  	}
		 ex)
		 while(�� ���������� ){
		 	������ �����!
		 	if(���� == ��) {
		 		continue;
		 	}
		 	������ �Դ´� !
		 	}
		 	
		 	Ư¡
		 	�ݺ����� �����ϰ� ���� �����͸� ���ǽ����� ����� continue;
		 	while for�� �迭�� �ణ�� ���̰� ����.
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
