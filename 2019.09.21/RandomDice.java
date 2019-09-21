class Die{
	int value;
	
	int roll() {
		java.util.Random random = new java.util.Random();
		value = random.nextInt(6); // 0~5
		value += 1; // 1~6
		
		return value;
	}
}

public class RandomDice {

	public static void main(String[] args) {
		Die die = new Die();
		int uThrows = 0;
		
		while(true) {
			int first = die.roll();
			int second = die.roll();
			System.out.println(first + "//" + second);
			++uThrows;
			
			if(first == second)
				break;
		}
		System.out.println("던진횟수는" + uThrows);
	

	}

}
