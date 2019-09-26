#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct person {
	char gender;
	int age;
	double height;
	char name[20];
};

void main() {
	person* ptr[5];
	int count;
	int i;
	// 사용자로부터 몇 명의 정보를 입력 받을 것인지 입력 받아,
	// 해당 수 만큼의 person 정보를 생성하고 입력 받아 출력하기
	printf("몇 명을 입력받을거임? >> ");
	scanf_s("%d", &count);

	for (i = 0; i < count; i++) {
		ptr[i] = (person*)malloc(sizeof(person));
		printf("이름 >> ");	scanf("%s", ptr[i]->name);
		printf("성별 >> ");	scanf_s(" %c", &ptr[i]->gender);
		printf("나이 >> ");	scanf_s("%d", &ptr[i]->age);
		printf("신장 >> ");	scanf_s("%lf", &ptr[i]->height);
	}
	printf("=======================================\n");

	for (i = 0; i < count; i++) {
		printf("성별 : %c \n", ptr[i]->gender);
		printf("나이 : %d \n", ptr[i]->age);
		printf("신장 : %g \n", ptr[i]->height);
		printf("성명 : %s \n", ptr[i]->name);
		printf("=======================================\n");
	}

	for (i = 0; i < count; i++) {
		free(ptr[i]);
	}

}