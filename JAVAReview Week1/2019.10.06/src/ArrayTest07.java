import javax.swing.JOptionPane;
 
public class ArrayTest07 {
    public static void main(String[] args) {
        
        int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
        
        int choice = Integer.parseInt(JOptionPane.showInputDialog("바꾸고 싶은 배열의 인덱스 번호를 입력하세요."));
        arr[choice] = 3333;
        
        String msg = "";
        
        for (int i=0; i<arr.length; i++) {
            msg += arr[i] + " ";
        }
 
        JOptionPane.showMessageDialog(null, msg);
        
    }
}
