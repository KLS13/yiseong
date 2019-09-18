#include<stdio.h>
void main() {
	int a = 45;
	int b = 65;
	int c = 75;
	int max;

	(a>b) ? printf("%d\n",a) : printf("%d\n",b);
	max = (a >= b) ? a : b;
	printf("둘 중 큰수는? %d", max);

	(a>b) ? printf("%d\n",a) : (b>c) ? printf("%d\n",b) : printf("%d\n",c);

	 
}