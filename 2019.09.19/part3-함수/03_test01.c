// 호출할때마다  Hello World를 출력하는 sayHello 함수 구현하기

#include <stdio.h>
/* 함수 선언 */
void sayHello(void);

void main(){
	sayHello();
	sayHello();
	sayHello();
}
/* 함수 정의 */
void sayHello(){
	printf("Hello World \n");
}