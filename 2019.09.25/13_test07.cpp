/*
�簢���� ��ǥ ������ �Է� �޾� �簢���� ���� ����ϱ�
���� ��) ���� ��ǥ �Է� (x,y) >> 1,1
���� ��) ���� ��ǥ �Է� (x,y) >> 3,4
���ΰ� 2 ���ΰ� 3 .  ���� : 6
*/
#include<stdio.h>

struct coordinate {
	int x;
	int y;
};
struct rectangle{
	coordinate* downLeft;
	coordinate* upRight;
	int area;
};

void main() {
	coordinate start;
	coordinate end;
	rectangle nemo;

	printf("���� ��ǥ �Է� : ");
	scanf_s("%d %d",&start.x, &start.y);

	printf("���� ��ǥ �Է� : ");
	scanf_s("%d %d",&end.x, &end.y);

	nemo.area = (start.x - end.x)*(start.y - end.y);

	printf("���̴� %d\n",nemo.area);
}

/*

	coordinate start;
	coordinate end;
	int area;

	rectangle nemo = { &start, &end };

	printf("���� ��ǥ �Է� (x y��) >> ");
	scanf_s("%d%d" &nemo.downLeft->x,&nemo.downLeft->y);

	printf("���� ��ǥ �Է� (x y��) >> ");
	scanf_s("%d%d" &nemo.upRight->x,&nemo.upRight->y);

	area = (nemo.upRight->x - nemo.downLeft->x) * (nemo.upRight->y - nemo.downLeft->y);
	printf("���� : %d \n", area);
	}

	



