#include < stdio.h>

void main() {
	int a,b,c,d,e;
	int max,min;

	max = 0; // �ִ밪�� �ʱ�ȭ ���� ���� ���� ��
	min = 100; // �ּҰ��� �ʱ�ȭ ���� ���� ū ��

	printf("5�� ���� �Է� >> " );
	scanf_s("%d %d %d %d %d", &a,&b,&c,&d,&e);

	if(max <= a){
		max = a;
	}
	if(max <= b){
		max = b;
	}
	if(max <= c){
		max = c;
	}
	if(max <= d){
		max = d;
	}
	if(max <= e){
		max = e;
	}

	if(min >= a)
		min = a;
	
	if(min >= b)
		min = b;
	
	if(min >= c)
		min = c;
	
	if(min >= d)
		min = d;
	
	if(min >= e)
		min = e;
printf("�ִ밪 %d\n",max);
printf("�ּҰ� %d",min);
}

	