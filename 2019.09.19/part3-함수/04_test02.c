//����ڷκ��� �Է� ���� ������ �����ϸ� �ش� ����ŭ "Hello World"�� ���.
// ������ �����ص� ���밪��ŭ ���.

#include <stdio.h>
/* �Լ� ���� */
void sayHello(int);
int getAbs(int);

void main(){
	int count;
	printf("����? ");
	scanf_s("%d", &count);
	sayHello(count);
}
/* �Լ� ���� */
void sayHello(int count){
	int i;

	for(i=1; i<= getAbs(count); i++){
		printf("Hello World \n");

}
}

int getAbs(int num) {
	if(num >= 0) {
		return num;
	}else{
		return num*(-1);
}
}
