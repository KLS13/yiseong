import javax.swing.JOptionPane;
 
public class ArrayTest08 {
    public static void main(String[] args) {
 
        int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
 
        int choice1 = Integer.parseInt(JOptionPane.showInputDialog("바꾸고 싶은 인덱스 번호1을 입력하세여."));
        int choice2 = Integer.parseInt(JOptionPane.showInputDialog("바꾸고 싶은 인덱스 번호2을 입력하세여."));
 
        int temp = arr[choice1];
        arr[choice1] = arr[choice2];
        arr[choice2] = temp;
 
        String msg = "";
        for (int i = 0; i < arr.length; i++) {
            msg += arr[i] + " ";
        }
 
        JOptionPane.showMessageDialog(null, msg);
 
    }
}
