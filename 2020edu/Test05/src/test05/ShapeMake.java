package test05;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ShapeMake {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("���ڸ� �Է��Ͻÿ�(Ȧ��,���)");
            n = sc.nextInt();
            if (n % 2 == 0 || n <= 0) {
                System.out.println("Ȧ���� �Է����ּ���(����Է����ּ���)");
            } else {
                break;
            }
        }

        /*
         * ������
         * */
        System.out.println("������ ���");
        int i, j = 0;
        int star = 0;
        //ó������ �ﰢ��
        for (i = 0; i < n; i += 2) {    //���ﰢ���� ���̴� �غ������� 1/2�� ��������� i�� 2�� ������Ŵ
            for (j = n; j >= i; j -= 2) {   // ���̴� ��� 2�� �����ϹǷ� ���̴� �غ�����(n)���� �ΰ� 2�� ���ҽ�Ű�� ���� �ٲ𶧸��� ������ �Ѱ��� �پ��� ��
                System.out.print("  ");
            }
            for (star = 0; star <= i ; star++) { //���� ���� ������ 2����������Ŵ
                System.out.print("* ");
            }
            System.out.println();   //�ٹٲ�
        }
        //�ؿ��ﰢ��
        for (i =0; i <= n - 2; i += 2) {   //���ﰢ���� ���� 1�� ���� ��µǰ� �ִ밳���� 2�� �����Ƿ� n-2����
            System.out.print("  "); //�ٸ���
            for (j = 0; j <= i; j += 2) {   //������ ������ 2���� �����Ͽ� �ϳ��� �þ����
                System.out.print("  ");
            }
            for (star = n - 2; star > i; star--) { //���ǰ����� 2���� ���� �پ�����´�.(�Է°������� 2�� ���Խ�����) (�����ﰢ���� �ε�ȣ������ �ݴ�����ָ��)
                System.out.print("* ");
            }
            System.out.println();
        }


        /*
         *           �����
         * */

        /*
         *     ���
         * */
        //���� ���ﰢ�� �ϳ�
        for (i = 0; i < n; i += 2) {
            //�Է��� ����ŭ ���������� �ﰢ�� ������
            for (int a = 0; a < n; a++) {
                System.out.print("  ");
            }
            //�������� �������Ҷ� ���κлﰢ���� ������
            for (j = n; j >= i; j -= 2) {
                System.out.print("  ");
            }
            for (star = 0; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         *   �ߴ�
         * */
        int count = n * 3; //�ߴ��� �ִ����

        for (i = 0; i < n / 2 + 1; i++) { //���̸� �Է��� ũ���� 2����1������ �Ͽ� ������ ����
            System.out.print("  ");   //�ٸ����
            for (j = 0; j < i; j++) { // i�� ũ�⸸ŭ ������ �༭ ���� ���� �������� ����(i�� 1�� �����ϴϱ� ���鵵 1�� ����
                System.out.print("  ");
            }
            for (int k = 0; k < n * 3; k++) { //�Է��� ũ���� 3�踸ŭ ���� ������
                if (k < count) {    //��, count��� �������� �������� ���� ����(count�� ���� ������ ��Ÿ���� ������, 2���� �پ��� �س���)
                    System.out.print("* ");
                }

            }
            //���� ���� �� Ű����� �߰���
            if(i == n/2){
                System.out.println();
                System.out.print("  ");   //�ٸ����
                for (j = 0; j < i; j++) { // i�� ũ�⸸ŭ ������ �༭ ���� ���� �������� ����(i�� 1�� �����ϴϱ� ���鵵 1�� ����
                    System.out.print("  ");
                }
                for (int k = 0; k < n * 3; k++) { //�Է��� ũ���� 3�踸ŭ ���� ������
                    if (k < count) {    //��, count��� �������� �������� ���� ����(count�� ���� ������ ��Ÿ���� ������, 2���� �پ��� �س���)
                        System.out.print("* ");
                    }

                }
            }

            count -= 2; //������ ���� ���� 2������
            System.out.println();
        }

        /*
         *    �ϴ�
         * */
        count = n;//���ʹصտ�(�ߴܿ��� ����Ѱ� ��Ȱ��)
        int count2 = 0;//�����ʹصտ�
        for (i = 0; i < n/2+1; i++) {   //�ϴ����� ������ �غ������� ���ݸ�ŭ������
            System.out.print("  ");
            for (j = i; j < n / 2; j++) {   //���ݸ�ŭ�� ������ ���
                System.out.print("  ");
            }
            //��(���ʹ�)
            for (int k = 0; k < n; k++) { //�Է°�����ŭ ����⸦�ϴµ� k�� count���� �������� ���� ����
                if (k < count) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  "); //����� ����

            //count2�� �̿��� �����ʹص��� �������� ������
            for (j = 0; j < count2; j++) {
                System.out.print("  ");
            }
            //��(�����ʹ�)
            for (int k = 0; k < n; k++) {
                if (k < count) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            count -= 2;
            count2 += 4;
            System.out.println();
        }



        //���׶��
        System.out.println();
        System.out.println("���׶�� ���");


        for (i = 0; i <= n * 2; i++) {
            for (j = 0; j <= n * 2; j++) {
                //���� �߽���ǥ(n,n)�κ��� (i,j)������ �Ÿ��� ����
                int d = (int) sqrt((i - n) * (i - n) + (j - n) * (j - n));
                //(i,j)��ǥ�� (n,n)������ �Ÿ��� �������Ǳ��� �����϶�  ��ǥ�� ��´�.
                if (d <= n) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}