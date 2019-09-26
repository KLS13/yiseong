/*
	문제. 사용자로부터 3개의 id를 입력 받아,
		MEMBER.txt 파일을 생성하시오.
		각 id의 구분은 콤마(,)로 진행하시오.
*/
#include <stdio.h>

void main() {
	FILE* out = fopen("MEMBER.txt", "w");
	char id[50];
	int n;
	int i;

	for (n = 0; n < 3; n++) {
		printf("id 입력 >> ");
		scanf("%s", id);		// id[0], id[1], id[2],,, id[i]
		i = 0;
		while (1) {
			if (id[i] == '\0') {
				break;
			}
			fputc(id[i++], out);
		}
		if (n != 2) {		// 마지막 아이디가 아니면
			fputc(',', out);
		}
	}

	fclose(out);

}