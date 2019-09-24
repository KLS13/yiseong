/*
	문제. 구조체 student 를 정의하시오.
		- 멤버 : name, scores[4](0~2:개별점수, 3:총점)
		  student 를 3명 저장하는 배열을 이용해 입력과 출력 구현하기
*/
#include <stdio.h>

struct student {
	char name[21];
	int scores[4];
};

void main() {
	struct student a[3];
	int i, j;

	for (i = 0; i < 3; i++) {
		// 입력 버퍼 비우기 (윈도우만 가능)
		fflush(stdin);

		// 입력 버퍼 비우기 (유닉스, 리눅스, Mac)
		// while (getchar() != '\n');	// 반복실행문이 없는 while문

		printf("이름 입력 >> ");
		gets(a[i].name);
		
		a[i].scores[3] = 0;
		for (j = 0; j < 3; j++) {
			printf("과목%d >> ", j + 1);
			scanf_s("%d", &a[i].scores[j]);
			a[i].scores[3] += a[i].scores[j];
		}
	}

	for (i = 0; i < 3; i++) {
		printf("%s\t", a[i].name);
		for (j = 0; j < 4; j++) {
			printf("%d\t", a[i].scores[j]);
		}
		printf("\n");
	}

}