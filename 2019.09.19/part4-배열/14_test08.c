#include<stdio.h>
void main() {
	int scores[4][4] = {0};
	int i,j;
	
		for(i=0; i<3; i++) {
			printf("%d�л� �����Է� >> \n",i+1);
			for(j=0; j<3; j++){
			printf("%d���� >> ", j+1);
			scanf_s("%d", &scores[i][j]); // ��������     [i][j]
			scores[i][3] += scores[i][j]; // �л��� ����  [i][3]
			scores[3][j] += scores[i][j]; // ���� ����  [3][j]
			scores[3][3] += scores[i][j]; // ��ü ����    [3][3]
		}		
	}
		printf("\t����1\t����2\t����3\t����\n");
		
		for(i=0; i<3; i++){
			printf("�л�%d\t",i+1);
			for(j=0; j<4; j++){
				printf("%d\t",scores[i][j]);
			}
			printf("\n");
		}
		printf("����\t");
		for(j=0; j<4; j++){
			printf("%d\t",scores[3][j]);
		}
		printf("\n");
				
}