import javax.swing.JOptionPane;
 
public class ArrayTest12 {
    public static void main(String[] args) {
 
        String str = JOptionPane.showInputDialog("�ؽ�Ʈ�� �Է��ϼ���.");
        char[] arr = new char[str.length()];
 
        String msg = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(arr.length - 1 - i);
            msg += arr[i];
        }
 
        JOptionPane.showMessageDialog(null, msg);
 
    }
}