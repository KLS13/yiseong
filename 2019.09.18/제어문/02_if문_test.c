#include<stdio.h>
void main() {
	int num=0;
	int a,b,c;
	int kor,eng,mat;
	double avg = 0;

	//===============================================//
	int x,y,z;
	double ave;
	char grade;



	printf("정수입력 : ");
	scanf_s("%d", &num);

	if(num >= 0){
		printf("%d\n", num);
	}else{
		printf("%d\n", num*(-1));
	}

	printf("\n");

	printf("정수 3개 입력 : ");
	scanf_s("%d %d %d", &a, &b, &c);

	if(a>b && a>c){
		printf("%d\n",a);
	}else if(b>a && b>c){
		printf("%d\n",b);
	}else if(c>a && c>b){
		printf("%d\n",c);
	}

	printf("\n");

	printf("점수 3개 입력 : ");
	scanf_s("%d %d %d", &kor, &eng, &mat);

	avg = (kor+eng+mat)/3.0;

	if(avg>=90){
		printf("A 평균은 %lf \n", avg);	
	}else if(avg>=80){
		printf("B 평균은 %lf \n", avg);
	}else if(avg>=70){
		printf("C 평균은 %lf \n", avg);
	}else if(avg>=60){
		printf("D 평균은 %lf \n", avg);
	}else{
		printf("F 평균은 %lf \n", avg);
	}
	
	//=====================================================//

	printf("국 영 수 점수 입력 : ");
	scanf_s("%d %d %d", &x, &y, &z);
	ave = (x+y+z)/3.0;

	if(ave >= 90) {
		grade = 'A';
		printf("학점은 %c, 평균은 %lf\n",grade,ave);
	}else if(ave >= 80) {
		grade = 'B';
		printf("학점은 %c, 평균은 %lf\n",grade,ave);
	}else if(ave >= 70) {
		grade = 'C';
		printf("학점은 %c, 평균은 %lf\n",grade,ave);
	}else{
		grade = 'D';
		printf("학점은 %c, 평균은 %g\n",grade,ave);

	}











}