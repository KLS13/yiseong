#include<stdio.h>
void main(){
	int cube[3][3];
	int i,j,n;
	int temp[3][3];
	n=1;

	for(i=0; i<3; i++) {
		for(j=0; j<3; j++) {
			cube[i][j] = n++;
			printf("%3d", cube[i][j]);

		}
		printf("\n");
	}
	for(i=0; i<3; i++) {
		for(j=2;j>=0;j--){
		temp[j][2-i] = cube[i][j];
		}
		printf("\n");
	}
	for(i=0; i<3; i++) {
		for(j=0; j<3; j++) {

			cube[i][j] = temp[i][j];
			printf("%3d", cube[i][j]);

		}
		printf("\n");

	}
}

