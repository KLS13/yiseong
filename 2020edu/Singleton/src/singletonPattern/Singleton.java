package singletonPattern;

public class Singleton {
	
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("Singleton Instance Created..");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}