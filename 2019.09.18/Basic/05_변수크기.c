#include<stdio.h>
int main()  {
	/* ����ũ��
		1) char		  1����Ʈ (ũ�� ����, ���� 1����Ʈ, �ѱ� 2����Ʈ)
		2) int		  4����Ʈ (ũ�� ����, 4����Ʈ ���� : -21�� ~ 21��)
		3) long		  4����Ʈ 
		4) long long  8����Ʈ
		5) float      4����Ʈ ( �Ҽ� 6�ڸ� ��ȿ )
		6) double     8����Ʈ ( �Ҽ� 15�ڸ� ��ȿ )

		������ ���� ũ��
		1) �ü�� + �����Ϸ�(VS)�� ���� �����ȴ�.
		2) char <= short <= int <= long <= long long  < ũ�� �� >
		3) ���� ũ�� Ȯ�� ������ : sizeof
	*/

printf("char ũ�� : %d \n", sizeof(char));
printf("int ũ�� : %d \n", sizeof(int));
printf("double ũ�� : %d \n", sizeof(double));

}