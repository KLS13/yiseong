//반지름을 입력받아 둘레와 넓이를 출력하는 프로그램.

#include<stdio.h>
#include<math.h>
#define PI 3.14

void main() {
	double ban = 0;
	double triArea=0;
	int width = 0, height = 0;
	int kor=0,eng=0,mat=0;
	
	
	printf("반지름을 입력하세요 :", ban);
	scanf_s("%lf", &ban);
	printf("원의 넓이는 : %lf\n", pow(ban,2)*PI);
	printf("\n");

	printf("너비와 높이를 입력하세요 :", width, height);
	scanf_s("%d %d", &width,&height);
	triArea = width*height/2.0;
	printf("삼각형 넓이는 %lf\n", triArea);
	printf("\n");

	printf("국어, 영어, 수학 입력 : ", kor,eng,mat);
	scanf_s("%d %d %d", &kor, &eng, &mat);
	(kor+eng+mat)/3.0 >= 80 ? printf("합격\n") : printf("불합격\n");
	
}