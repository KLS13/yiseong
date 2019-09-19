#include<stdio.h>
void main() {
	int scores[4][4] = {0};
	int i,j;
	
		for(i=0; i<3; i++) {
			printf("%d학생 점수입력 >> \n",i+1);
			for(j=0; j<3; j++){
			printf("%d과목 >> ", j+1);
			scanf_s("%d", &scores[i][j]); // 개별점수     [i][j]
			scores[i][3] += scores[i][j]; // 학생별 총점  [i][3]
			scores[3][j] += scores[i][j]; // 과목별 총점  [3][j]
			scores[3][3] += scores[i][j]; // 전체 총점    [3][3]
		}		
	}
		printf("\t과목1\t과목2\t과목3\t총점\n");
		
		for(i=0; i<3; i++){
			printf("학생%d\t",i+1);
			for(j=0; j<4; j++){
				printf("%d\t",scores[i][j]);
			}
			printf("\n");
		}
		printf("총점\t");
		for(j=0; j<4; j++){
			printf("%d\t",scores[3][j]);
		}
		printf("\n");
				
}