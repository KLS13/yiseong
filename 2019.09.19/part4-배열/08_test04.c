#include<stdio.h>
void main(){
	int a[5];
	int max = 0, min = 100;
	int i;
	

	for(i=0 ; i<5 ; i++){
		printf("%d번째 정수입력 :", i+1);
		scanf_s("%d",&a[i]);

		if(a[i] >= max){
			max = a[i];
		}else if(a[i] <= min){
			min = a[i];
		
	}
		
	}
	printf("최대값 %d \t 최소값 %d\n", max,min);
}
