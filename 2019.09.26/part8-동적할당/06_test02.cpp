#include "my.h"

struct account {
	int balance;
	char* number;

	void create(char num[], int money) {
		int length = strlen(num) + 1;
		number = (char*)malloc(sizeof(char)*length);
		strcpy(number, num);
		balance =  money;
	}
	void leave() {
		free(number);
	}
};
	void main() {
		account me;
		me.create("123",1000);
		me.leave();
	}