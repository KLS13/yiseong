#include <stdio.h>

struct circle {
	double radius;
	double area;
};

void main() {
	struct circle a[3];	// a[0], a[1], a[2]
	int i;				// a[0].radius, a[0].area
						// a[1].radius, a[1].area
						// a[2].radius, a[2].area
						// a[i].radius, a[i].area
	for (i = 0; i < 3; i++) {
		printf("%d번째 원의 반지름 >> ", i + 1);
		scanf_s("%lf", &a[i].radius);
		a[i].area = 3.14 * a[i].radius * a[i].radius;
	}

	for (i = 0; i < 3; i++) {
		printf("%d번째 원의 넓이 : %g \n", i + 1, a[i].area);
	}
}