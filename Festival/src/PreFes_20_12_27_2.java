
public class PreFes_20_12_27_2 {
	public static void main(String[] args) {

		// 메소드 isDivide( ) 를 작성하세요.
		// 이때, 나누어지면 true,
		// 나누어지지 않으면 false을 반환함.

		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 >> " + result);

	}

	public static boolean isDivide(int num1, int num2) {
		boolean result;

		if (num1 % num2 == 0) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}
