#include<stdio.h>
int main() {
	int a = 73;
	int front = a/10;
	int rear = a%10;

	int times = 3690;
	int hour = times/3600;
	int minute = times%3600/60;
	int second = times%60;


	printf(" ���ڸ� : %d, ���ڸ� : %d \n", front,rear);
	printf(" %d�� %d�� %d�� \n", hour,minute,second);

	return 0;
}