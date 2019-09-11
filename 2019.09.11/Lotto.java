import java.util.*;

public class Lotto {
    int[] lotto = new int[6];
    public Lotto(){
        this.action();
        this.print();
    }

    public void action(){
         for(int i=0;i<lotto.length;i++){
           lotto[i]=(int)(Math.random()*45)+1;
          
            for(int j=0; j<i; j++) { 
             if (lotto[i] == lotto[j]) { 
             i-=1; .
             break;
             }
          }
      }
  }
 
    public void print(){
         Arrays.sort(lotto); 
         for (int i : lotto) {
            System.out.print(i+" ");
            
            
         }
         System.out.println(" ");
         System.out.println("1등을 기원합니다.");
    }
    
    public static void main(String[] args) {
        new Lotto();
      
    }
}

