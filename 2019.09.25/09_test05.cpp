/* ���� �߽� ��ǥ�� �������� �Է¹޾� �ش� ���� ���� ����ϱ�.
   �ش� ���� ���� ( �߽� ��ǥ, ������ + �ѷ� + ����) ���
*/

#include<stdio.h>
#define PI 3.14;
struct coordinate{
	int x;
	int y;
};
//��
struct circle {
	int ban;
	double size;
	double area;
	coordinate coor;
};
void main() {
	circle cir;
	printf("�߽���ǥ�� �������� �Է��ϼ���:");
	scanf_s("%d %d %d",&cir.coor.x,&cir.coor.y,&cir.ban);

	cir.size = cir.ban*2*PI;
	cir.area = cir.ban*cir.ban*PI;

	printf("=====================================\n"
		   "�߽���ǥ�� (%d,%d) �������� %d\n"
		   "=====================================\n"
		   "�ѷ��� %lf ���̴� %lf\n",cir.coor.x,cir.coor.y,cir.ban,cir.size,cir.area);
}

	
