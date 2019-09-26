#include "my.h"

// id 입력
char* input() {
	char* id = (char*)malloc(sizeof(char)*20);
	printf("ID 입력 >> ");
	gets(id);	// scanf("%s", &id[0]);
	return id;
}

// id 출력
void output(char* id) {
	printf("ID 확인 >> %s \n", id);
}

void main() {
	char *id1, *id2, *id3;	// char* id[20];

	id1 = input();
	id2 = input();
	id3 = input();
	printf("==============================\n");
	output(id1);
	output(id2);
	output(id3);

	free(id1);
	free(id2);
	free(id3);
}