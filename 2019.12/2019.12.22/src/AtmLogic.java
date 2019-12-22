import javax.swing.JOptionPane;

class AtmLogic {
	String name; // �̸�
	String password; // ��й�ȣ
	int money; // �ܾ�
	int account; // �������
	int chance = 3; // ��й�ȣ ��ȸ 

	public AtmLogic() {}

	void run() {
		createAccount(); // ���尳��
		choiceMenu(); // �޴�����
	}

	// ���� ���� ���� + ����
	void createAccount() {
		while (true) {
			String message = "������ �����ϰڽ��ϱ�?\n";
			message += "yes: 1��	no: 2��";
			int choice = Integer.parseInt(JOptionPane.showInputDialog(message));

			if (choice == 1) {
				name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
				account = Integer.parseInt(JOptionPane.showInputDialog("����Ͻ� ���¹�ȣ�� �Է����ּ���."));
				password = JOptionPane.showInputDialog("��й�ȣ�� �������ּ���.");

				String message2 = name + "���� ������ �����Ǿ����ϴ�.\n";
				message2 += "���¹�ȣ: " + account;
				JOptionPane.showMessageDialog(null, message2);
				break;
			} else if (choice == 2) {
				JOptionPane.showMessageDialog(null, "���α׷� ����");
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null, "����");
			}
		}
	}

	// �޴� ��� + ���� 
	int showMenu() {
		String menu = "========���� ATM =========\n";
		menu += "1. �Ա�  2. ���  3. �ܾ���ȸ  4. ������ü  5. ����";

		int choice = Integer.parseInt(JOptionPane.showInputDialog(menu + "�޴��� �����ϼ���."));
		return choice;
	}

	// �޴� ���ÿ� ���� ����
	void choiceMenu() {
		while (true) {
			int choice = showMenu();

			if (choice > 5 || choice < 1) {
				JOptionPane.showMessageDialog(null, "�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				choice = showMenu();
			}

			if (choice == 5) {
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
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
					JOptionPane.showMessageDialog(null, "���� �ܾ���" + money + "�� �Դϴ�.");
					break;

				case 4:
					transfer();
					break;
				}
			}
		}
	}

	// ��й�ȣ Ȯ��
	boolean checkPassword() {
		boolean check = false;

		while (true) {
			String checkPassword = JOptionPane.showInputDialog("��й�ȣ�� �Է����ּ���. (��ȸ " + chance + "��)");

			if (password.equals(checkPassword)) {
				check = true;
				break;
			} else if (chance != 1) {
				chance--;
				JOptionPane.showMessageDialog(null, "��й�ȣ�� �ٽ� �Է����ּ���.");
			} else if (chance == 1) {
				JOptionPane.showMessageDialog(null, "���α׷� ����");
				System.exit(0);
			}
		}
		return check;
	}

	// ������ü
	void transfer() {
		String tName = JOptionPane.showInputDialog("�������� �̸��� �Է����ּ���.");
		String tAccount = JOptionPane.showInputDialog("��ü���� ���¹�ȣ�� �Է����ּ���.");
		int tMoney = Integer.parseInt(JOptionPane.showInputDialog("��ü�� �ݾ��� �Է����ּ���."));

		if (tMoney > money) {
			JOptionPane.showMessageDialog(null, "�ܾ��� �����մϴ�. ���� �ܾ���" + money + "�� �Դϴ�.");
		} else {
			money -= tMoney;
			String message = tAccount + " (" + tName + ") ���� " + tMoney + "�� ��ü�Ͽ����ϴ�.";
			JOptionPane.showMessageDialog(null, message);
		}
	}

	// �Ա�
	void deposit() {
		int deposit = Integer.parseInt(JOptionPane.showInputDialog("�Ա��� �ݾ��� �Է��ϼ���."));
		money += deposit;
		JOptionPane.showMessageDialog(null, "�Ա� �� �ܾ��� " + money + "�� �Դϴ�.");
	}

	// ���
	void withdraw() {
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog("����� �ݾ��� �Է��ϼ���."));
		if (money < withdraw) {
			JOptionPane.showMessageDialog(null, "�ܾ��� �����մϴ�. ���� �ܾ���" + money + "�� �Դϴ�.");
		} else {
			money -= withdraw;
		}
	
	}

}
