/* 
������ ���� �����ϴ� ���α׷� ����
���� ��)
1�� 1ȣ >> 2��
1�� 2ȣ >> 4��
2�� 1ȣ >> 3��
2�� 2ȣ >> 4��
3�� 1ȣ >> 2��
3�� 2ȣ >> 3��
1�� ��� �ο� : xx.x��
2�� ��� �ο� : xx.x��
3�� ��� �ο� : xx.x��
��ü ��� �ο� :
*/

#include<stdio.h>
void main(){
	int apt[3][2];
	int i,j;
	int sum=0;
	int total;

	for(i=0; i<3; i++) {
		for(j=0; j<2; j++) {
			printf("%d�� %dȣ �ο��� >> ",i+1,j+1);
			scanf_s("%d", &apt[i][j]);
		}
	}
	printf("==================================\n");
	/*
	for(i=0; i<3; <i++){
	printf("%d�� ��� : %f \n", i+1, (apt[i][0]+apt[i][1]) / 2.0);
	}
}
*/
	for(i=0; i<3; i++) {
		total = 0;
		for(j=0; j<2; j++) {
			
			printf("%d�� %dȣ �ο��� >> %d\n",i+1,j+1,apt[i][j]);
			sum+=apt[i][j];
			total+=apt[i][j];
		}
		printf("%d�� ��� �ο� :%lf \n", i+1,total/2.0);
		printf("��� �ο� : %lf \n", sum/6.0);
		
	}

}