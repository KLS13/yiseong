import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int [] a = new int[10];
		int front = 0;
		int back = 9;
		int inputnum;
	
		for(int i=0; i<a.length; i++) {
			System.out.print("10°³ ÀÔ·Â");
			inputnum=input.nextInt();
			
			if(inputnum%2==1) {
				a[front++] = inputnum;
			}else {
				a[back--] = inputnum;
			}
		}	
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		
				}

		
	      }	
			
	}

