/* 사용자 정의 함수(function)
	1) 관련되는 작업을 하나의 함수로 구분
	2) 반복적으로 사용되는 작업을 함수로 구분

   사용 방법
	1) 함수 선언 : 해당 함수가 만들어져 있음을 알림
	2) 함수 정의 : 실제로 함수를 만듬
	3) 함수 호출 : 함수를 사용

   함수 정의
    리턴타입 함수명(매개변수=argument=parameter) {
		return 리턴값;
		}

*/
#include<stdio.h>
/*함수 선언 */
int adder(int, int);

void main() {
	int a, b;
	int result;
	printf("더하고자 하는 두 정수를 입력 >> ");
	scanf_s("%d%d", &a,&b);
	adder(a,b);
	result = adder(a,b);
	printf("%d\n",result);
}
/* 함수 선언 */
int adder(int first, int second) {
	int total = first + second;
	return total;
}