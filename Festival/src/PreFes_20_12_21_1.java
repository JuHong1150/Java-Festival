import java.util.Random;

public class PreFes_20_12_21_1 {
	public static void main(String[] args) {
		// 8ĭ ũ�� �迭, ����, ����ū��, ����������

		Random rd = new Random();
		int[] num = new int[8];
		int max, min;
		max = num[0];
		min = num[0];

		System.out.print("�迭�� �ִ� ��� �� >>");
		for (int i = 0; i < num.length; i++) {
			num[i] = rd.nextInt(100);
			System.out.print(num[i] + " ");

			for (int j = 1; j < num.length; j++) {

				if (num[j] > max) {
					max = num[j];
				}
				if (num[j] < min) {
					min = num[j];
				}

			}
		}
		System.out.println();
		System.out.println("�ִ�" + max);
		System.out.println("�ּڰ�" + min);

	}

}
