/*
	문제. 사용자로부터 3개의 id를 입력 받아,
		MEMBER.txt 파일을 생성하시오.
		각 id의 구분은 콤마(,)로 진행하시오.
*/
#include<stdio.h>
int main() {

	FILE* out = fopen("MEMBER.txt", "w");
	char id[50];
	int n;
	

	if(out==NULL){
		printf("파일 생성 오류 \n");
		return -1; //비정상 종료
	}
	for (n = 0; n < 3; n++) {
		printf("id 입력 >> ");
		scanf("%s", id);	

		fputs(id,out);

		if(n!=2) { // 마지막 아이디가 아니라면,
			fputc(',',out);
		}
	}
	fclose(out);
}