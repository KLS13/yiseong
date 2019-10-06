import java.util.Scanner;
 
public class Array_Review_02 {
    public static void main(String[] args) {
 
        String[] arSubject = {"Java", "js", "C", "JSP", "HTML"};
        int[] arScore = {95, 88, 76, 62, 55};
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("과목명을 입력하세요:(종료는 END)");
            String name = sc.next();
            
            for(int i=0; i<arSubject.length; i++) {
                if (arSubject[i].equals(name)) {
                    System.out.println(arSubject[i] + "의 점수: " + arScore[i]);
                }
            }
            
            if (name.equals("END")) {
            	System.out.println("프로그램 종료");
                break;
            }
        }
    
        sc.close();
        
    }
}
