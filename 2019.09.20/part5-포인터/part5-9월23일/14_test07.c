#include<stdio.h>

void output(int ptr[][4], int row) {
	int i,j;
	for( i=0; i<row; i++){
		for( j=0; j<4 ; j++) {
			printf("%3d", ptr[i][j]);
		}
		printf("\n");
	}
}

void rotate(int ptr[][4], int row){
	int i,j,num1,num2;
	int temp[4][4];
	printf(" 회전 횟수는 ? :" );
	scanf_s("%d",&num2);
	for(num1=0; num1 < num2; num1++){  
	for (i = 0; i < row; i++) {
		for (j = 0; j < 4; j++) {
			temp[j][3-i] = ptr[i][j];
		}
	}
	for (i = 0; i < row; i++) {
		for (j = 0; j < 4; j++) {
			ptr[i][j] = temp[i][j];	
		}	
	}
}
	printf("\n");
}

void main() {
	int cube[4][4] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
	output(cube, sizeof(cube)/sizeof(cube[0])); // 큐브상태 출력
	rotate(cube, sizeof(cube)/sizeof(cube[0])); // cube 90도 회전
 	output(cube, sizeof(cube)/sizeof(cube[0]));// cube상태 출력
}