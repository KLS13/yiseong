/*
	����. ����ü triangle �� �����Ͻÿ�
	��� ����(�ʵ�)   : width, height
	��� �Լ�(�޼ҵ�) : �Է� input, ��� output, ���̹�ȯ getTriangleArea
	*/
#include<stdio.h>

struct triangle{
	int width;
	int height;

	void input(){
		printf("�ʺ� �Է� >> ");
		scanf_s("%d",&width);
		printf("���� �Է� >> ");
		scanf_s("%d",&height);
	}
	void output(){
		printf("�ʺ�� :%d , ���̴� : %d \n", width,height);
		printf("���� : %g \n",getTriangleArea());
	}
	double getTriangleArea() {
		
		return width*height/2.0;
	}
};

void main() {
	triangle info;
	info.input();
	info.output();
	info.getTriangleArea();
}