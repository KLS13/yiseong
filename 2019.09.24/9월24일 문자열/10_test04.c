/*
	가길동의 점수 입력
	   국어 >> xx
	   영어 >> xx
	   수학 >> xx
	나길동의 점수 입력
	   국어 >> xx
	   영어 >> xx
	   수학 >> xx
	다길동의 점수 입력
	   국어 >> xx
	   영어 >> xx
	   수학 >> xx

			국어		영어		수학
	가길동	xx		xx		xx
	나길동	xx		xx		xx
	다길동	xx		xx		xx
*/
#include <stdio.h>

void main() {
	int scores[4][4] = {0};	// 모든 요소를 0으로 초기화
	char *subjects[4] = {"국어", "영어", "수학", "총점"};
	char *names[4] = {"가길동", "나길동", "다길동", "합계"};
	int i, j;

	// 1. 입력
	for (i = 0; i < 3; i++) {		// i : 이름번호
		printf("%s의 점수 입력\n", names[i]);
		for (j = 0; j < 3; j++) {	// j : 과목번호
			printf("  %s >> ", subjects[j]);
			scanf_s("%d", &scores[i][j]);
			scores[i][3] += scores[i][j];	// 학생총점 += 각과목점수
			scores[3][j] += scores[i][j];	// 과목합계 += 각과목점수
			scores[3][3] += scores[i][j];	// 전체총점 += 각과목점수
		}
	}

	// 2. 출력
	printf("\t");
	for (i = 0; i < 4; i++) {
		printf("%s\t", subjects[i]);
	}
	printf("\n");

	for (i = 0; i < 4; i++) {
		printf("%s\t", names[i]);
		for (j = 0; j < 4; j++) {
			printf("%d\t", scores[i][j]);
		}
		printf("\n");
	}

}