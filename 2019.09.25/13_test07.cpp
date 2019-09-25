/*
사각형의 좌표 정보를 입력 받아 사각형의 넓이 출력하기
실행 예) 시작 좌표 입력 (x,y) >> 1,1
실행 예) 종료 좌표 입력 (x,y) >> 3,4
가로가 2 세로가 3 .  넓이 : 6
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

	printf("시작 좌표 입력 : ");
	scanf_s("%d %d",&start.x, &start.y);

	printf("종료 좌표 입력 : ");
	scanf_s("%d %d",&end.x, &end.y);

	nemo.area = (start.x - end.x)*(start.y - end.y);

	printf("넓이는 %d\n",nemo.area);
}

/*

	coordinate start;
	coordinate end;
	int area;

	rectangle nemo = { &start, &end };

	printf("시작 좌표 입력 (x y순) >> ");
	scanf_s("%d%d" &nemo.downLeft->x,&nemo.downLeft->y);

	printf("종료 좌표 입력 (x y순) >> ");
	scanf_s("%d%d" &nemo.upRight->x,&nemo.upRight->y);

	area = (nemo.upRight->x - nemo.downLeft->x) * (nemo.upRight->y - nemo.downLeft->y);
	printf("넓이 : %d \n", area);
	}

	



