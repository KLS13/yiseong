#include<stdio.h>
void main(){
	int num;
	int kor,eng,mat;
	int avg;

	printf("�����Է� : ");
	scanf_s("%d", &num);

	switch(num%2){
	case 0 :
		printf("¦��\n");
		break;
	case 1 :
		printf("Ȧ��\n");
		break;
	default :
		printf("������\n");
	}

	
	printf("���� 3�� �Է� : ");
	scanf_s("%d %d %d", &kor,&eng,&mat);
	avg = (kor+eng+mat)/3;

	switch(avg/10) {
	case 10 :
	case 9 :
		printf("A���� ����� %d\n",avg);
		break;
	case 8 :
		printf("B���� ����� %d\n",avg);
		break;
	case 7 :
		printf("C���� ����� %d\n",avg);
		break;
	case 6 :
		printf("D���� ����� %d\n",avg);
		break;
	default :
		printf("F���� ����� %d\n",avg);
	}
}

		

