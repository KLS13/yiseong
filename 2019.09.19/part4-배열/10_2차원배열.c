#include<stdio.h>

void main() {
	int a[3][5];
	int i,j;

	for(i=0; i<3; i++) {
		for(j=0; j<5; j++) {
			printf("%d행 %d열 입력 >> ",i+1,j+1);
			scanf_s("%d", &a[i][j]);
		}
	}

	for(i=0; i<3; i++) {
		for(j=0; j<5; j++) {
			printf("%d \t",a[i][j]);
		}
		printf("\n");
	}
}