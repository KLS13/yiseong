/* 
다음과 같이 동작하는 프로그램 구현
실행 예)
1층 1호 >> 2명
1층 2호 >> 4명
2층 1호 >> 3명
2층 2호 >> 4명
3층 1호 >> 2명
3층 2호 >> 3명
1층 평균 인원 : xx.x명
2층 평균 인원 : xx.x명
3층 평균 인원 : xx.x명
전체 평균 인원 :
*/

#include<stdio.h>
void main(){
	int apt[3][2];
	int i,j;
	int sum=0;
	int total;

	for(i=0; i<3; i++) {
		for(j=0; j<2; j++) {
			printf("%d층 %d호 인원수 >> ",i+1,j+1);
			scanf_s("%d", &apt[i][j]);
		}
	}
	printf("==================================\n");
	/*
	for(i=0; i<3; <i++){
	printf("%d층 평균 : %f \n", i+1, (apt[i][0]+apt[i][1]) / 2.0);
	}
}
*/
	for(i=0; i<3; i++) {
		total = 0;
		for(j=0; j<2; j++) {
			
			printf("%d층 %d호 인원수 >> %d\n",i+1,j+1,apt[i][j]);
			sum+=apt[i][j];
			total+=apt[i][j];
		}
		printf("%d층 평균 인원 :%lf \n", i+1,total/2.0);
		printf("평균 인원 : %lf \n", sum/6.0);
		
	}

}