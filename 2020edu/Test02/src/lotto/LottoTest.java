package lotto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LottoTest {

	public static void main(String[] args) {

		ArrayList<Integer> lotto = new ArrayList<>();

		String input = JOptionPane.showInputDialog("[채팅창]");

		if (input.equals("로또")) {

			for (int i = 0; i <= 5; i++) {
				int num = (int) (Math.random() * 45) + 1;

				if (lotto.size() < 1) {
					lotto.add(num);
				} else if (lotto.size() > 0 && lotto.get(i - 1) == num) {
					i = i - 1;
				} else {
					lotto.add(num);
				}
			}
			lotto.sort(null); // lotto.sort(Comparator.naturalOrder());
			System.out.println("로또를 검색하셨습니다 \n" + "추천 로또번호는" + "\n" + lotto);
		}else {
			System.out.println(input);
		}
	}
}
