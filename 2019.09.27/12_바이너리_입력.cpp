/*
	���̳ʸ� ��� : rb, wb, ab
	���������� �״�� ����� : ����, �̹���, ������, ����ü ��

	���̳ʸ� ��� �Լ�

	size_t fwrite(const void* ptr, size_t size, size_t count, FILE* stream)

	size_t : ����� ó���ϴ� int

	ptr : �Էµ� �����Ͱ� ����� �ּ�
	size : �Է� �������� ũ��
	count : �Է��� �������� ����
	stream : �Է� �����Ͱ� ���۵� ��Ʈ��(���� ������)
*/
#include<stdio.h>

struct person {
	int age;
	char name[20];
};

void main(){
	FILE* in = fopen("person.bin","rb");
	person woman;

	if(in == NULL ) {
		printf("���� ���� ���� \n");
		return;
	}
	fread(&woman,sizeof(woman),1,in);

	printf("���� : %d��, �̸� : %s \n", woman.age, woman.name);

	fclose(in);
}