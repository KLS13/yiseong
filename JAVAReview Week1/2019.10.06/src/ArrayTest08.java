import javax.swing.JOptionPane;
 
public class ArrayTest08 {
    public static void main(String[] args) {
 
        int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
 
        int choice1 = Integer.parseInt(JOptionPane.showInputDialog("�ٲٰ� ���� �ε��� ��ȣ1�� �Է��ϼ���."));
        int choice2 = Integer.parseInt(JOptionPane.showInputDialog("�ٲٰ� ���� �ε��� ��ȣ2�� �Է��ϼ���."));
 
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
