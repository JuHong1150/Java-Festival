
public class PreFes_20_12_28_1 {
	public static void main(String[] args) {

		// num1, num2, op (+, -, *, /) �� �Ű������� �޾� num1�� num2�� op�� �°� ������ �������
		// ��ȯ���ִ� cal �޼ҵ带 �ۼ��ϼ���.

		int num1 = 50;
		int num2 = 15;
		char op = '*';

		System.out.println(cal(num1, num2, op));

	}

	private static String cal(int num1, int num2, char op) {
		int result = 0;

		if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			result = num1 - num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		}

		return result + "";
	}

}
