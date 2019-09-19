//사용자로부터 입력 받은 정수를 전달하면 해당 값만큼 "Hello World"를 출력.
// 음수를 전달해도 절대값만큼 출력.

#include <stdio.h>
/* 함수 선언 */
void sayHello(int);
int getAbs(int);

void main(){
	int count;
	printf("몇개출력? ");
	scanf_s("%d", &count);
	sayHello(count);
}
/* 함수 정의 */
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
