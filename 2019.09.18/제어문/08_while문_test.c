#include<stdio.h>
void main() {
	int num;


	while(1){
		printf("정수입력 : ");
		scanf_s("%d", &num);

		if(num==0){
			printf("종료\n");
			break;
		}else{
			printf("출력 : %d \n", num);
			
		}
	}
}