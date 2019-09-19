#include < stdio.h>

void main() {
	int a,b,c,d,e;
	int max,min;

	max = 0; // 최대값의 초기화 값은 가장 작은 값
	min = 100; // 최소값의 초기화 값은 가장 큰 값

	printf("5개 정수 입력 >> " );
	scanf_s("%d %d %d %d %d", &a,&b,&c,&d,&e);

	if(max <= a){
		max = a;
	}
	if(max <= b){
		max = b;
	}
	if(max <= c){
		max = c;
	}
	if(max <= d){
		max = d;
	}
	if(max <= e){
		max = e;
	}

	if(min >= a)
		min = a;
	
	if(min >= b)
		min = b;
	
	if(min >= c)
		min = c;
	
	if(min >= d)
		min = d;
	
	if(min >= e)
		min = e;
printf("최대값 %d\n",max);
printf("최소값 %d",min);
}

	