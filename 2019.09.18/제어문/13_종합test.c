// 1~100 사이 짝수의 합계 출력

#include<stdio.h>
void main(){
	int even;
	int sum=0;
	int chance = 1;
	int chance_1 = 0;
	int num;
	int a;
	int total=0;
	double avg;

	for(even=1;even<=100;even++){
		if(even % 2 != 0){
			continue;
		}
		sum+=even;
	}
	printf("1~100까지 합은 %d \n", sum);

	printf("===============================================\n");
	/* 사용자로부터 몇개의 정수를 처리할 것인지.
	   그 만큼 새로운 정수를 입력받아 평균을 낸다.
	   음수는 평균에서 제외한다.*/

	
	printf("몇개 처리할래? : ");
	scanf_s("%d", &num);
	if(num==0){
		printf("프로그램 종료\n");
	}else{
		while(1){
	printf("정수입력 : ");
	scanf_s("%d", &a);

	if(chance != num && a>=0){
		total+=a;
		chance++;
	}else if(chance != num && a<0){
		chance_1++;
		chance++;
	}else if(chance <= num){
		total+=a;
		break;
		}	
	}
}

	avg=(double)total/(chance-chance_1);
	printf("%lf\n",avg);

	printf("==============================================================================\n");

}
