// 1부터 전달받은 정수까지의 평균을 반환하는 getAverage 함수를 구현

#include<stdio.h>
double getAverage(int);


void main(){
	double result;
	result =  getAverage(10);
	printf("평균은? %g \n", result);

}

double getAverage(int num){
	int i=1;
	int sum=0;
	
	for( i; i<=num; i++){
		sum += i;
	}
	return (double)sum/num;
	
}

