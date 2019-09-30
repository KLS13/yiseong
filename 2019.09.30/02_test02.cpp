//연락처 관리 프로그램
/*
# 1. 새 연락처 삽입 기능
# 2. 기존 연락처 삭제 기능
# 3. 기존 연락처 수정 기능
# 4. 기존 연락처 검색 기능
# 5. 전체 연락처 검색 기능
# 6. 전체 연락처 파일 보관 기능 
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/*
#define INSERT 1
#define DELETE 2
#define SEARCH 3
#define PRINT 4
#define EXIT 5
*/
enum { INSERT=1, DELETE=2, SEARCH=3, PRINT=4, EXIT=5 };

struct Contact {
	char name[20];
	char tel[20];
};

void menu() {
	printf("*****MENU*****\n");
	printf("* 1. INSERT  *\n");
	printf("* 2. DELETE  *\n");
	printf("* 3. SEARCH  *\n");
	printf("* 4. PRINT   *\n");
	printf("* 5. EXIT    *\n");
	printf("**************\n");
}

void insert(Contact* b[], int* idx) {
	//  idx == main의 &idx
	// *idx == main의 idx 값
	
	// b 배열의 사용 가능한 인덱스 범위 : 0 ~ 99
	// 배열이 가득 찼는지 검사
	if (*idx == 100) {
		printf("연락처 저장 공간이 부족합니다.\n");
		return;
	}

	printf("[INSERT]\n");

	// 1. Contact의 저장 공간 동적 할당
	b[*idx] = (Contact*)malloc(sizeof(Contact));

	// 2. 생성된 공간에 정보 입력
	printf("새 연락처 성명 >> ");	gets(b[*idx]->name);
	printf("전화번호 >> ");			gets(b[*idx]->tel);

	// 3. 인덱스 증가
	(*idx)++;

	printf("[END INSERT]\n");
}

void print(Contact* b[], int* idx) {
	int i;

	// 배열이 비어 있는지 검사
	if (*idx == 0) {
		printf("저장된 연락처가 없습니다.\n");
		return;
	}

	printf("[PRINT]\n");

	for (i = 0; i < *idx; i++) {
		printf("%d. %s, %s\n", i + 1, b[i]->name, b[i]->tel);
	}

	printf("[END PRINT]\n");
}

void search(Contact* b[], int* idx) {
	int i;
	char findName[20];
	int isExist = 0;	// 찾는 이름이 없다!

	// 배열이 비어 있는지 검사
	if (*idx == 0) {
		printf("저장된 연락처가 없습니다.\n");
		return;
	}

	printf("[SEARCH]\n");

	printf("찾는 성명 입력 >> ");	gets(findName);

	for (i = 0; i < *idx; i++) {
		if (strcmp(findName, b[i]->name) == 0) {
			printf("%d. %s, %s\n", i + 1, b[i]->name, b[i]->tel);
			isExist = 1;	// 찾는 이름이 있다!
		}
	}

	if ( !isExist ) {	// if (isExist == 0) {
		printf("%s 연락처는 없습니다.\n", findName);
	}

	printf("[END SEARCH]\n");
}

void remove(Contact* b[], int* idx) {
	int i, j;
	char deleteName[20];
	int isExist = 0;	// 삭제할 이름이 없다!

	// 배열이 비어 있는지 검사
	if (*idx == 0) {
		printf("저장된 연락처가 없습니다.\n");
		return;
	}

	printf("[DELETE]\n");

	printf("삭제할 성명 입력 >> ");	gets(deleteName);

	for (i = 0; i < *idx; i++) {
		if (strcmp(deleteName, b[i]->name) == 0) {
			free(b[i]);		// 실제 연락처의 삭제
			for (j = i; j < *idx - 1; j++) {
				b[j] = b[j + 1];
			}
			isExist = 1;	// 삭제할 이름이 있다!
			(*idx)--;		// 인덱스 감소
		}
	}

	if ( !isExist ) {	// if (isExist == 0) {
		printf("%s 연락처는 없습니다.\n", deleteName);
	} else {
		printf("%s 연락처가 삭제되었습니다.\n", deleteName);
	}

	printf("[END DELETE]\n");
}

void exit(Contact* b[], int* idx) {
	FILE* out;
	int i;

	// 배열이 비어 있는지 검사
	if (*idx == 0) {
		printf("저장된 연락처가 없습니다.\n");
		return;
	}

	out = fopen("CONTACT.dat", "wb");
	if (out == NULL) {
		printf("파일 생성 실패!\n");
		return;
	}

	for (i = 0; i < *idx; i++) {
		// 주소, 크기, 개수, 파일포인터
		fwrite(b[i], sizeof(Contact), 1, out);
		free(b[i]);
	}

	printf("CONTACT.dat 파일이 생성되었습니다.\n");
	fclose(out);
}

int start(Contact* b[]) {
	FILE* in = fopen("CONTACT.dat", "rb");
	Contact temp;	// CONTACT.dat 파일에서 읽어들인 연락처 1개 임시저장
	int idx = 0;
	int readCount = 0;

	if (in == NULL) {
		printf("CONTACT.dat 파일이 없습니다.\n");
	} else {
		while (1) {
			// fread 의 리턴 : 읽어 들인 실제 데이터의 개수
			// fread(주소, 크기, 개수, 파일포인터)
			readCount = fread(&temp, sizeof(Contact), 1, in);
			if (readCount < 1) {
				break;	// 무한루프 종료
			} else {
				b[idx] = (Contact*)malloc(sizeof(Contact));
				*b[idx] = temp;
				idx++;
			}
		}
		printf("CONTACT.dat 파일을 읽었습니다.\n");
		fclose(in);
	}
	return idx;
}

int main() {

	Contact* b[100];
	int idx;
	int choice;

	idx = start(b);

	while (1) {
		menu();
		printf("선택 >> ");	scanf_s("%d", &choice);	getchar();
		switch (choice) {
		case INSERT: insert(b, &idx);	break;		// case 1:
		case DELETE: remove(b, &idx);	break;		// case 2:
		case SEARCH: search(b, &idx);	break;		// case 3:
		case PRINT: print(b, &idx);		break;		// case 4:
		case EXIT: exit(b, &idx);		return 0;	// case 5:
		default: printf("없는 명령입니다. 다시 입력하세요. \n");
		}
	}

}