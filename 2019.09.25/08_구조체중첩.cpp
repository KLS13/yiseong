#include<stdio.h>

struct wallet {
	int money;
	char card[21];
};
struct person {
	char gender;
	int age;
	double height;
	char name[21];
	wallet w; 
};

void main(){
	wallet gucci = {50000, "samsung" };
	person human = {'F', 20, 168.5, "alice", gucci };

	printf("����:%c , ����:%d,  Ű : %g, �̸�:%s \n",human.gender, human.age, human.height, human.name);
	printf("���� �� : %d, ���� ī�� : %s \n",human.w.money, human.w.card);
}
