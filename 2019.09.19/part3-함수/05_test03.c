// 1���� ���޹��� ���������� ����� ��ȯ�ϴ� getAverage �Լ��� ����

#include<stdio.h>
double getAverage(int);


void main(){
	double result;
	result =  getAverage(10);
	printf("�����? %g \n", result);

}

double getAverage(int num){
	int i=1;
	int sum=0;
	
	for( i; i<=num; i++){
		sum += i;
	}
	return (double)sum/num;
	
}

