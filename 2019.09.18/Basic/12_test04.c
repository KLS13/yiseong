#include<stdio.h>
int main() {
	int a = 73;
	int front = a/10;
	int rear = a%10;

	int times = 3690;
	int hour = times/3600;
	int minute = times%3600/60;
	int second = times%60;


	printf(" 앞자리 : %d, 뒷자리 : %d \n", front,rear);
	printf(" %d시 %d분 %d초 \n", hour,minute,second);

	return 0;
}