package test05;

public class SoundableEx {
	private static void printSound(SoundAction action) {
		System.out.println(action.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		printSound(new Tiger());
	}
}
