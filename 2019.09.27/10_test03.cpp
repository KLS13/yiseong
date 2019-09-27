/*
	문제. 구조체 student 를 정의하시오.
			- 멤버변수 (필드) : 학번, 성명, 국어, 영어, 수학, 평균, 학점
			- 멤버함수(메소드): 입력 input(), 출력 output, 계산 calc

			해당 구조체의 데이터를 SCORE.txt 파일로 저장하기.
			방식은: 10101,가길동,80,81,83,81.33333,B
*/
#include<stdio.h>

struct student {
	char name[20];
	char grade;
	int num,kor,eng,mat;
	double avg;

	void input() {
		printf("성명 : "); scanf("%s",name);
		printf("학번 : "); scanf("%d",&num);
		printf("국어 : "); scanf("%d",&kor);
		printf("영어 : "); scanf("%d",&eng);
		printf("수학 : "); scanf("%d",&mat);
		calc();
		}
	void calc() {
		avg = (kor+eng+mat)/3.0;
		if(avg>=90) grade='A';
		else if(avg>=80) grade='B';
		else if(avg>=70) grade='C';
		else if(avg>=60) grade='D';
		else grade='F';
	}
	void output() {
		printf("%d %s %d %d %d %g %c \n",num,name,kor,eng,mat,avg,grade);
	}
};
void main() {
	struct student mystu;

	FILE* out = fopen("SCORES.txt","a");

	if(out==NULL) {
		printf("파일 생성 오류 \n");
		return;
	}

	mystu.input();
	mystu.output();

	fprintf(out,"%d,%s,%d,%d,%d,%g,%c \n",
	mystu.num,mystu.name,mystu.kor,mystu.eng,mystu.mat,mystu.avg,mystu.grade);


	fclose(out);
}


