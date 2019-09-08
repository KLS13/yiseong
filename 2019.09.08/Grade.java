import java.util.Scanner;

public class Grade {
//(if문활용,  나이를 입력하고 팔굽혀펴기횟수를 입력하여 등급과 합격여부 나타내기)
    public static void main(String[] args) {

    	int age;
    	int score;

    	String grade = "" ;
    	String good = "" ;
      
        System.out.println("응시자의 나이를 입력하세요(숫자만) : ");
        Scanner input1 = new Scanner(System.in);
        age = input1.nextInt();

       
        System.out.println("팔굽혀펴기 횟수를 입력하세요(숫자만) : ");    
        Scanner input2 = new Scanner(System.in);
        score = input2.nextInt();     

        if(age <=29) { // 29세 이하

            if(score >=70) { 
                grade="특급";  
                good="축하합니다";
            }

            else if(score >= 60) { 
                grade = "1급";
                good="축하합니다";
            }

            else if(score >= 51) {
                grade = "2급";
                good="좀 더 열심히 해보세요!";

            }else {
            	grade = "불합격";
            	good="다음 기회를 노려보세요!";
            }
        }        

        else if(age >= 30) { //30세 이상

            if(score >=67) {
                grade="특급";   
                good="축하합니다";
            }

            else if(score >= 57) {
                grade = "1급";
                good="축하합니다";
            }

            else if(score >= 48) {
                grade = "2급";
                good="좀 더 열심히 해보세요!";
            }else {
            	grade = "불합격";
            	good="다음 기회를 노려보세요!";
            }

        }
        
        System.out.println("귀하의 등급은 " + grade + " 입니다.");
        System.out.println(good + " 수고하셨습니다.");
    }
}