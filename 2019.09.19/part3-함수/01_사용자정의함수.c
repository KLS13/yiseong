/* ����� ���� �Լ�(function)
	1) ���õǴ� �۾��� �ϳ��� �Լ��� ����
	2) �ݺ������� ���Ǵ� �۾��� �Լ��� ����

   ��� ���
	1) �Լ� ���� : �ش� �Լ��� ������� ������ �˸�
	2) �Լ� ���� : ������ �Լ��� ����
	3) �Լ� ȣ�� : �Լ��� ���

   �Լ� ����
    ����Ÿ�� �Լ���(�Ű�����=argument=parameter) {
		return ���ϰ�;
		}

*/
#include<stdio.h>
/*�Լ� ���� */
int adder(int, int);

void main() {
	int a, b;
	int result;
	printf("���ϰ��� �ϴ� �� ������ �Է� >> ");
	scanf_s("%d%d", &a,&b);
	adder(a,b);
	result = adder(a,b);
	printf("%d\n",result);
}
/* �Լ� ���� */
int adder(int first, int second) {
	int total = first + second;
	return total;
}