
public class PreFes_20_12_28_1 {
	public static void main(String[] args) {

		// num1, num2, op (+, -, *, /) 를 매개변수로 받아 num1과 num2를 op에 맞게 연산한 결과값을
		// 반환해주는 cal 메소드를 작성하세요.

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
