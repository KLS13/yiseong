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



	printf("�����Է� : ");
	scanf_s("%d", &num);

	if(num >= 0){
		printf("%d\n", num);
	}else{
		printf("%d\n", num*(-1));
	}

	printf("\n");

	printf("���� 3�� �Է� : ");
	scanf_s("%d %d %d", &a, &b, &c);

	if(a>b && a>c){
		printf("%d\n",a);
	}else if(b>a && b>c){
		printf("%d\n",b);
	}else if(c>a && c>b){
		printf("%d\n",c);
	}

	printf("\n");

	printf("���� 3�� �Է� : ");
	scanf_s("%d %d %d", &kor, &eng, &mat);

	avg = (kor+eng+mat)/3.0;

	if(avg>=90){
		printf("A ����� %lf \n", avg);	
	}else if(avg>=80){
		printf("B ����� %lf \n", avg);
	}else if(avg>=70){
		printf("C ����� %lf \n", avg);
	}else if(avg>=60){
		printf("D ����� %lf \n", avg);
	}else{
		printf("F ����� %lf \n", avg);
	}
	
	//=====================================================//

	printf("�� �� �� ���� �Է� : ");
	scanf_s("%d %d %d", &x, &y, &z);
	ave = (x+y+z)/3.0;

	if(ave >= 90) {
		grade = 'A';
		printf("������ %c, ����� %lf\n",grade,ave);
	}else if(ave >= 80) {
		grade = 'B';
		printf("������ %c, ����� %lf\n",grade,ave);
	}else if(ave >= 70) {
		grade = 'C';
		printf("������ %c, ����� %lf\n",grade,ave);
	}else{
		grade = 'D';
		printf("������ %c, ����� %g\n",grade,ave);

	}











}