// 길이가 5인 배열, 해당 배열에 1~5 값을 채운뒤 그 값을 출력



#include<stdio.h>
void main() {
	int a[5];
	int i;

	for(i=0 ; i < 5 ; i++ ){
		
		a[i] = i+1;
		printf("%d ",a[i]);
	}
}