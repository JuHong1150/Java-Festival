
public class PreFes_20_12_27_2 {
	public static void main(String[] args) {

		// �޼ҵ� isDivide( ) �� �ۼ��ϼ���.
		// �̶�, ���������� true,
		// ���������� ������ false�� ��ȯ��.

		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("��� Ȯ�� >> " + result);

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
