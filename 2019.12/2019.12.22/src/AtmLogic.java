import javax.swing.JOptionPane;

class AtmLogic {
	String name; // 이름
	String password; // 비밀번호
	int money; // 잔액
	int account; // 은행계좌
	int chance = 3; // 비밀번호 기회 

	public AtmLogic() {}

	void run() {
		createAccount(); // 통장개설
		choiceMenu(); // 메뉴선택
	}

	// 통장 개설 여부 + 개설
	void createAccount() {
		while (true) {
			String message = "통장을 개설하겠습니까?\n";
			message += "yes: 1번	no: 2번";
			int choice = Integer.parseInt(JOptionPane.showInputDialog(message));

			if (choice == 1) {
				name = JOptionPane.showInputDialog("이름을 입력하세요.");
				account = Integer.parseInt(JOptionPane.showInputDialog("사용하실 계좌번호를 입력해주세요."));
				password = JOptionPane.showInputDialog("비밀번호를 설정해주세요.");

				String message2 = name + "님의 통장이 개설되었습니다.\n";
				message2 += "계좌번호: " + account;
				JOptionPane.showMessageDialog(null, message2);
				break;
			} else if (choice == 2) {
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null, "에러");
			}
		}
	}

	// 메뉴 출력 + 선택 
	int showMenu() {
		String menu = "========은행 ATM =========\n";
		menu += "1. 입금  2. 출금  3. 잔액조회  4. 계좌이체  5. 종료";

		int choice = Integer.parseInt(JOptionPane.showInputDialog(menu + "메뉴를 선택하세요."));
		return choice;
	}

	// 메뉴 선택에 따른 실행
	void choiceMenu() {
		while (true) {
			int choice = showMenu();

			if (choice > 5 || choice < 1) {
				JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 다시 입력해주세요.");
				choice = showMenu();
			}

			if (choice == 5) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				System.exit(0);
			}

			if (checkPassword()) {
				switch (choice) {
				case 1:
					deposit();
					break;

				case 2:
					withdraw();
					break;

				case 3:
					JOptionPane.showMessageDialog(null, "현재 잔액은" + money + "원 입니다.");
					break;

				case 4:
					transfer();
					break;
				}
			}
		}
	}

	// 비밀번호 확인
	boolean checkPassword() {
		boolean check = false;

		while (true) {
			String checkPassword = JOptionPane.showInputDialog("비밀번호를 입력해주세요. (기회 " + chance + "번)");

			if (password.equals(checkPassword)) {
				check = true;
				break;
			} else if (chance != 1) {
				chance--;
				JOptionPane.showMessageDialog(null, "비밀번호를 다시 입력해주세요.");
			} else if (chance == 1) {
				JOptionPane.showMessageDialog(null, "프로그램 종료");
				System.exit(0);
			}
		}
		return check;
	}

	// 계좌이체
	void transfer() {
		String tName = JOptionPane.showInputDialog("예금주의 이름을 입력해주세요.");
		String tAccount = JOptionPane.showInputDialog("이체받을 계좌번호를 입력해주세요.");
		int tMoney = Integer.parseInt(JOptionPane.showInputDialog("이체할 금액을 입력해주세요."));

		if (tMoney > money) {
			JOptionPane.showMessageDialog(null, "잔액이 부족합니다. 현재 잔액은" + money + "원 입니다.");
		} else {
			money -= tMoney;
			String message = tAccount + " (" + tName + ") 으로 " + tMoney + "원 이체하였습니다.";
			JOptionPane.showMessageDialog(null, message);
		}
	}

	// 입금
	void deposit() {
		int deposit = Integer.parseInt(JOptionPane.showInputDialog("입금할 금액을 입력하세요."));
		money += deposit;
		JOptionPane.showMessageDialog(null, "입금 후 잔액은 " + money + "원 입니다.");
	}

	// 출금
	void withdraw() {
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog("출금할 금액을 입력하세요."));
		if (money < withdraw) {
			JOptionPane.showMessageDialog(null, "잔액이 부족합니다. 현재 잔액은" + money + "원 입니다.");
		} else {
			money -= withdraw;
		}
	
	}

}
