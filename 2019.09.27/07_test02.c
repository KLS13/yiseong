/*
	����. ����ڷκ��� 3���� id�� �Է� �޾�,
		MEMBER.txt ������ �����Ͻÿ�.
		�� id�� ������ �޸�(,)�� �����Ͻÿ�.
*/
#include<stdio.h>
int main() {

	FILE* out = fopen("MEMBER.txt", "w");
	char id[50];
	int n;
	

	if(out==NULL){
		printf("���� ���� ���� \n");
		return -1; //������ ����
	}
	for (n = 0; n < 3; n++) {
		printf("id �Է� >> ");
		scanf("%s", id);	

		fputs(id,out);

		if(n!=2) { // ������ ���̵� �ƴ϶��,
			fputc(',',out);
		}
	}
	fclose(out);
}