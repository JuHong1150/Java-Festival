
public class PreFes_20_12_30_2 {
	public static void main(String[] args) {

		// getMiddle�޼ҵ�� �ϳ��� �ܾ �Է� �޽��ϴ�.
		// �ܾ �Է� �޾Ƽ� ��� ���ڸ� ��ȯ�ϵ��� getMiddle�޼ҵ带 ����� ������.
		// �ܾ��� ���̰� ¦���ϰ�� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�. ������� �Է¹��� �ܾ power�̶�� w�� ��ȯ�ϸ� �ǰ�,
		// �Է¹��� �ܾ test��� es�� ��ȯ�ϸ� �˴ϴ�.

		System.out.println(getMiddle("test"));

	}

	private static String getMiddle(String string) {
		// TODO Auto-generated method stub

		String[] number = string.split("");
		String str = "";

		if (string.length() % 2 == 0) { // ���� ���̰� ¦���� �����Ǳ��� /2 �� ��-1 ���� �ε����� ������ ���� /2 ��° �ε����� ���� ���� ���
			str = number[string.length() / 2 - 1] + number[string.length() / 2];

		} else if (string.length() % 2 != 0) { // Ȧ����� ������ ���� /2 ��° �ε����� ���
			str = number[string.length() / 2];
		}
		return str;
	}

}
