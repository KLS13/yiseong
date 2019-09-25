/* 원의 중심 좌표와 반지름을 입력받아 해당 원의 정보 출력하기.
   해당 원의 정보 ( 중심 좌표, 반지름 + 둘레 + 넓이) 출력
*/

#include<stdio.h>
#define PI 3.14;
struct coordinate{
	int x;
	int y;
};
//원
struct circle {
	int ban;
	double size;
	double area;
	coordinate coor;
};
void main() {
	circle cir;
	printf("중심좌표와 반지름을 입력하세요:");
	scanf_s("%d %d %d",&cir.coor.x,&cir.coor.y,&cir.ban);

	cir.size = cir.ban*2*PI;
	cir.area = cir.ban*cir.ban*PI;

	printf("=====================================\n"
		   "중심좌표는 (%d,%d) 반지름은 %d\n"
		   "=====================================\n"
		   "둘레는 %lf 넓이는 %lf\n",cir.coor.x,cir.coor.y,cir.ban,cir.size,cir.area);
}

	
