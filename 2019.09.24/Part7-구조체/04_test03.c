/*
	����. ����ü car �� �����Ͻÿ�.
		- ��� : model, price, rental('Y', 'N')
		- ����ü ���� 2���� �����ϰ�, ����ڷκ��� ���� �Է� �޾� ���
		- ��õ : ���� 2��
		- ����ü �迭
*/
#include <stdio.h>

// 1. ����ü car ����
struct car {
	char rental;
	int price;
	char model[50];
};

void main() {
	// 2. ����ü car ���� 2�� ����
	struct car myCar, yourCar;

	// 3. �Է�
	printf("myCar �� >> ");	scanf("%s", myCar.model);
	printf("myCar ���� >> ");	scanf("%d", &myCar.price);
	printf("myCar ��Ż >> ");	scanf(" %c", &myCar.rental);

	printf("yourCar �� >> ");	scanf("%s", yourCar.model);
	printf("yourCar ���� >> ");	scanf("%d", &yourCar.price);
	printf("yourCar ��Ż >> ");	scanf(" %c", &yourCar.rental);

	// 4. ���
	printf("myCar �� : %s \n", myCar.model);
	printf("myCar ���� : %d \n", myCar.price);
	printf("myCar ��Ż : %c \n", myCar.rental);
	
	printf("yourCar �� : %s \n", yourCar.model);
	printf("yourCar ���� : %d \n", yourCar.price);
	printf("yourCar ��Ż : %c \n", yourCar.rental);

}