#include<stdio.h>
void main() {
	int num;


	while(1){
		printf("�����Է� : ");
		scanf_s("%d", &num);

		if(num==0){
			printf("����\n");
			break;
		}else{
			printf("��� : %d \n", num);
			
		}
	}
}