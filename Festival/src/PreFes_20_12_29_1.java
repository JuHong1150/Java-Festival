
public class PreFes_20_12_29_1 {
	public static void main(String[] args) {

		// startValue���� endValue������ ���� �� �������� ����ϴ� getPerfectNumber()�޼ҵ带 �����ϼ���
		// ������?
		// �ڱ� �ڽ��� ������ ���� ����� ������ �� �ڱ� �ڽ��� �Ǵ� ��
		// 1. �� ���� ����� �� ���ؾ� ��.
		// 2. �ڱ� �ڽ��� �� �� ���� ������� ������ �ڱ� �ڽŰ� �Ȱ����� Ȯ���غ���.

		// ������ ���ϱ�

		int startValue = 2;
		int endValue = 1000;

		getPerfectNumber(startValue, endValue);

	}

	private static void getPerfectNumber(int startValue, int endValue) {
		// TODO Auto-generated method stub
		System.out.print("2~1000������ ������ : ");
		for (int i = startValue; i <= endValue; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (i == sum) {
				System.out.print(i + " ");
			}
		}
	}

}
