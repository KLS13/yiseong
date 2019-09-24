/*
	문제. 구조체 car 를 정의하시오.
		- 멤버 : model, price, rental('Y', 'N')
		- 구조체 변수 2개를 선언하고, 사용자로부터 값을 입력 받아 출력
		- 추천 : 변수 2개
		- 구조체 배열
*/
#include <stdio.h>

// 1. 구조체 car 정의
struct car {
	char rental;
	int price;
	char model[50];
};

void main() {
	// 2. 구조체 car 변수 2개 선언
	struct car myCar, yourCar;

	// 3. 입력
	printf("myCar 모델 >> ");	scanf("%s", myCar.model);
	printf("myCar 가격 >> ");	scanf("%d", &myCar.price);
	printf("myCar 렌탈 >> ");	scanf(" %c", &myCar.rental);

	printf("yourCar 모델 >> ");	scanf("%s", yourCar.model);
	printf("yourCar 가격 >> ");	scanf("%d", &yourCar.price);
	printf("yourCar 렌탈 >> ");	scanf(" %c", &yourCar.rental);

	// 4. 출력
	printf("myCar 모델 : %s \n", myCar.model);
	printf("myCar 가격 : %d \n", myCar.price);
	printf("myCar 렌탈 : %c \n", myCar.rental);
	
	printf("yourCar 모델 : %s \n", yourCar.model);
	printf("yourCar 가격 : %d \n", yourCar.price);
	printf("yourCar 렌탈 : %c \n", yourCar.rental);

}