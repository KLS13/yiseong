import java.util.Scanner;

public class Grade {
//(if��Ȱ��,  ���̸� �Է��ϰ� �ȱ������Ƚ���� �Է��Ͽ� ��ް� �հݿ��� ��Ÿ����)
    public static void main(String[] args) {

    	int age;
    	int score;

    	String grade = "" ;
    	String good = "" ;
      
        System.out.println("�������� ���̸� �Է��ϼ���(���ڸ�) : ");
        Scanner input1 = new Scanner(System.in);
        age = input1.nextInt();

       
        System.out.println("�ȱ������ Ƚ���� �Է��ϼ���(���ڸ�) : ");    
        Scanner input2 = new Scanner(System.in);
        score = input2.nextInt();     

        if(age <=29) { // 29�� ����

            if(score >=70) { 
                grade="Ư��";  
                good="�����մϴ�";
            }

            else if(score >= 60) { 
                grade = "1��";
                good="�����մϴ�";
            }

            else if(score >= 51) {
                grade = "2��";
                good="�� �� ������ �غ�����!";

            }else {
            	grade = "���հ�";
            	good="���� ��ȸ�� ���������!";
            }
        }        

        else if(age >= 30) { //30�� �̻�

            if(score >=67) {
                grade="Ư��";   
                good="�����մϴ�";
            }

            else if(score >= 57) {
                grade = "1��";
                good="�����մϴ�";
            }

            else if(score >= 48) {
                grade = "2��";
                good="�� �� ������ �غ�����!";
            }else {
            	grade = "���հ�";
            	good="���� ��ȸ�� ���������!";
            }

        }
        
        System.out.println("������ ����� " + grade + " �Դϴ�.");
        System.out.println(good + " �����ϼ̽��ϴ�.");
    }
}