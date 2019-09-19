#include<stdio.h>
void main() {
	int scores[5];
	int i;
	int total, max, min;

	for(i=0 ; i<5 ; i++){
		printf("%d번째 점수입력 :", i+1);
		scanf_s("%d",&scores[i]);

	}

	max = min = total = scores[0];

	for(i=1; i<5; i++) {
		if(max <= scores[i]) {
			max=scores[i];
		}
		if(min >= scores[i]){
			max=scores[i];
		}
		total  += scores[i];
	}
	printf("%d\t %d\t %d\n",min,max,total);
	printf("평균 : %g \n", total/5);
}
