#include <stdio.h>

struct person {
	char gender;
	int age;
	double height;
	char name[21];
};

void main() {
	struct person human = {'Y', 20, 168.5, "alice"};
	printf("¿Ã∏ß : %s \n", human.name);
}