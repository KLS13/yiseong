/*
	����. ����ü student �� �����Ͻÿ�.
			- ������� (�ʵ�) : �й�, ����, ����, ����, ����, ���, ����
			- ����Լ�(�޼ҵ�): �Է� input(), ��� output, ��� calc

			�ش� ����ü�� �����͸� SCORE.txt ���Ϸ� �����ϱ�.
			�����: 10101,���浿,80,81,83,81.33333,B
*/
#include<stdio.h>

struct student {
	char name[20];
	char grade;
	int num,kor,eng,mat;
	double avg;

	void input() {
		printf("���� : "); scanf("%s",name);
		printf("�й� : "); scanf("%d",&num);
		printf("���� : "); scanf("%d",&kor);
		printf("���� : "); scanf("%d",&eng);
		printf("���� : "); scanf("%d",&mat);
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
		printf("���� ���� ���� \n");
		return;
	}

	mystu.input();
	mystu.output();

	fprintf(out,"%d,%s,%d,%d,%d,%g,%c \n",
	mystu.num,mystu.name,mystu.kor,mystu.eng,mystu.mat,mystu.avg,mystu.grade);


	fclose(out);
}


