#include<stdio.h>
void main() {
	int a[8][9];
	int i,j;

	for(i=2; i<=9; i++){
		for(j=1; j<=9; j++){
			a[i-2][j-1]= i*j;
		}
	}
	/*
	for(i=0; i<9; i++){
		for(j=0; j<9; j++){
			a[i][j]= (i+2)*(j+1);
		}
	}

*/

	for(i=0; i<8; i++){
		for(j=0; j<9; j++){
			printf("%4d ",a[i][j]);
		}
		printf("\n");
	}
}