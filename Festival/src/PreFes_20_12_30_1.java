
public class PreFes_20_12_30_1 {
	public static void main(String[] args) {

		// �Ǻ���ġ ����

		int input = 8;

		for (int i = 0; i < input; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	private static int fibo(int i) {
		// TODO Auto-generated method stub

		if (i <= 1) { // 1. ���۰��� 1
			return 1; // 2. �ʱⰪ�� 1
		} else {
			return fibo(i - 2) + fibo(i - 1);
		}

	}

}
