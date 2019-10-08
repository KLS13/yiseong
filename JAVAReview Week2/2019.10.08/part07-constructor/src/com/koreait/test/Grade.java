package com.koreait.test;

public class Grade {
	int kor;
	int eng;
	int mat;
	double average;
	char grade;
	
	Grade(int _kor, int _eng, int _mat){
		kor = _kor;
		eng = _eng;
		mat = _mat;
		average = getAverage();
		grade = getGrade();
	}
	
	double getAverage() {
		return (kor+eng+mat)/3.0;
	 }
	 char getGrade() {
		 if(average>=90) {
			 return 'A';
		 }else if(average>=80) {
			 return 'B';
		 }else if(average>=70) {
			 return 'C';
		 }else if(average<=60) {
			 return 'D';
		 }else {
			 return 'F';
		 }

	 }

}
