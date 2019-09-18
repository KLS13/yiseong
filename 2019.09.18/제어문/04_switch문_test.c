#include<stdio.h>
void main(){
	int num;
	int kor,eng,mat;
	int avg;

	printf("정수입력 : ");
	scanf_s("%d", &num);

	switch(num%2){
	case 0 :
		printf("짝수\n");
		break;
	case 1 :
		printf("홀수\n");
		break;
	default :
		printf("에러임\n");
	}

	
	printf("점수 3개 입력 : ");
	scanf_s("%d %d %d", &kor,&eng,&mat);
	avg = (kor+eng+mat)/3;

	switch(avg/10) {
	case 10 :
	case 9 :
		printf("A학점 평균은 %d\n",avg);
		break;
	case 8 :
		printf("B학점 평균은 %d\n",avg);
		break;
	case 7 :
		printf("C학점 평균은 %d\n",avg);
		break;
	case 6 :
		printf("D학점 평균은 %d\n",avg);
		break;
	default :
		printf("F학점 평균은 %d\n",avg);
	}
}

		

