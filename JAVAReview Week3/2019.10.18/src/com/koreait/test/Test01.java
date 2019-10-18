package com.koreait.test;

/*
 Score 클래스 : 필드 : kor,eng,mat
 			    메소드 : toString(), equals()
 */
class Score {
	
	private int kor;
	private int eng;
	private int mat;
	
	public Score(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	@Override
	public String toString() {
		String info = "국어 : " +kor+", 영어 : "+ eng + ", 수학 : " + mat;
		return info;
	}
	@Override
	public boolean equals(Object obj) {
	
		if(obj != null && obj instanceof Score) {
			return kor==((Score)obj).kor && eng==((Score)obj).eng && mat==((Score)obj).mat;
		}else {
		return false;
		}
	}
}	
public class Test01 {

	public static void main(String[] args) {
		Score score1 = new Score(88,100,94);
		Score score2 = new Score(88,100,94);
		
		if(score1 == score2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}

		if(score1.equals(score2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		System.out.println(score1);
		System.out.println(score2);
	}
}
/*
 
package com.koreait.test;

class Score {
	
	// Field
	private int kor;
	private int eng;
	private int mat;

	// Constructor
	public Score(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// Method
	@Override
	public String toString() {
		return "Score [kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Score) {
			Score other = (Score) obj;
			return kor == other.kor && eng == other.eng && mat == other.mat;
		} else {
			return false;
		}
	}
	
}

public class Test01 {

	public static void main(String[] args) {

		Score score1 = new Score(70, 80, 90);
		Score score2 = new Score(70, 80, 90);
		
		if (score1.equals(score2)) {
			System.out.println("같은 성적이다.");
		} else {
			System.out.println("다른 성적이다.");
		}
		
	}

}
*/