/*
	���̳ʸ� ��� : rb, wb, ab
	���������� �״�� ����� : ����, �̹���, ������, ����ü ��

	���̳ʸ� ��� �Լ�

	size_t fwrite(const void* ptr, size_t size, size_t count, FILE* stream)

	size_t : ����� ó���ϴ� int

	ptr : ����� �����Ͱ� ����� �ּ�
	size : ����� �������� ũ��
	count : ����� �������� ����
	stream : ����� �����Ͱ� ���۵� ��Ʈ��(���� ������)
*/
#include <stdio.h>

struct person {
	int age;
	char name[20];
};

void main() {
	FILE* out = fopen("person.bin", "wb");
	person woman = {20, "alice"};

	if (out == NULL) {
		printf("���� ���� ����\n");
		return;
	}

	fwrite(&woman, sizeof(woman), 1, out);

	fclose(out);
}