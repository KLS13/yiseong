/*
	����. ����ü tv �� �����Ͻÿ�
		- ������� : int ch, vol
		- ����Լ� : ��� info, upCh, downCh, upVol, downVol
		- ch : 1 ~ 5  
		- vol : 0 ~ 3
		*/
#include<stdio.h>
struct tv{
	int ch;
	int vol;

	void init(int x, int y) {
		 ch = x;
		vol = y;
	}
	void upCh(){
		ch++;
		if(ch>5){
			ch=1;
		}
	}
	void downCh(){
		ch--;
		if(ch<1){
			ch=5;
		}
	}
	void upVol(){
		vol++;
		if(vol>=3){
			vol=3;
		}
	}
	void downVol(){
		vol--;
		if(vol<=0){
			vol=0;
		}
	}

	void info(){
		printf("ä���� %d\t",ch);
		printf("������ %d \n",vol);
	}
};

void main() {
	tv lg;
	int i;
	lg.init(1,1); // ch :1, vol :1;
	for(i = 0; i<10; i++) {
		lg.upCh();
		lg.upVol();
	}
	lg.info();
	
	printf("==================================\n");
	for(i = 0; i<10; i++) {
		lg.downCh();
		lg.downVol();
	}
	lg.info();
}

	

	