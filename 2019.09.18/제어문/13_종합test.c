// 1~100 ���� ¦���� �հ� ���

#include<stdio.h>
void main(){
	int even;
	int sum=0;
	int chance = 1;
	int chance_1 = 0;
	int num;
	int a;
	int total=0;
	double avg;

	for(even=1;even<=100;even++){
		if(even % 2 != 0){
			continue;
		}
		sum+=even;
	}
	printf("1~100���� ���� %d \n", sum);

	printf("===============================================\n");
	/* ����ڷκ��� ��� ������ ó���� ������.
	   �� ��ŭ ���ο� ������ �Է¹޾� ����� ����.
	   ������ ��տ��� �����Ѵ�.*/

	
	printf("� ó���ҷ�? : ");
	scanf_s("%d", &num);
	if(num==0){
		printf("���α׷� ����\n");
	}else{
		while(1){
	printf("�����Է� : ");
	scanf_s("%d", &a);

	if(chance != num && a>=0){
		total+=a;
		chance++;
	}else if(chance != num && a<0){
		chance_1++;
		chance++;
	}else if(chance <= num){
		total+=a;
		break;
		}	
	}
}

	avg=(double)total/(chance-chance_1);
	printf("%lf\n",avg);

	printf("==============================================================================\n");

}
