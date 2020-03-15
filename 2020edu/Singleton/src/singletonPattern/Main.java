package singletonPattern;
/*
������ �޸� ������ ����ϵ��� �� �ѹ� new �����ڷ� �ν��Ͻ��� �����⶧���� �޸��� ���� ���Դϴ�.
���������� ����ǰ� �����޼���� ȣ�� �ϱ� ������ �ٸ� Ŭ�������� ����ϱ� �����ϴ�.
����� ��ü�� ����ؾ��ϴ� �ڵ����� �Ź� ��ü�� ���������ʰ� ���� ��ü�� ����ϵ��� �ϸ� ���ɸ鿡�� �Ǹ��� ����ϴ�.
 */

public class Main {
	
    public static void main(String[] args) {
        Normal normal1 = new Normal();
        Normal normal2 = new Normal();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        if(normal1 == normal2) {
            System.out.println("normal1�� normal2�� ���� ����");
        }else {
            System.out.println("normal1�� normal2�� ���� �ٸ�");
        }
        
        if(singleton1 == singleton2) {
            System.out.println("singleton1�� singleton2�� ���� ����");
        }else {
            System.out.println("singleton1�� singleton2�� ���� �ٸ�");
        }
    }
}
