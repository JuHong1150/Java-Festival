import java.util.Random;
import java.util.Scanner;

public class PreFes_20_12_21_1_1 {
	public static void main(String[] args) {

		// 8ĭ ũ���� �迭�� �����ϰ� �������� �ʱ�ȭ �� ��
		// ���� ū ���� ���� ���� ���� ����Ͻÿ�.

		Random rd = new Random();
		int[] num = new int[8];  // 1. 8ĭ ũ���� �迭�� �����ϰ� 

		System.out.print("�迭�� �ִ� ��� �� >>");
		for (int i = 0; i < num.length; i++) {
			num[i] = rd.nextInt(100);  // 2. �� ���� 0~99���� �����ϰ� �����´�.
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " "); // 3. ������ �� ������ ���

		}
		int max, min;
		max = min = num[0];  // 4. �ִ�, �ּڰ��� ã�� ���� ������ �������ְ�

		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) { // 5. for ���� ���鼭 ������ ���� max �������� ũ�� �� ���� max�� �ǰ�
				max = num[i];
			}
			if (num[i] < min) { // �������� min ���� ������ �� ���� min ���� �ȴ�.
				min = num[i];
			}
		}

		System.out.println("\n�ִ�" + max);
		System.out.println("�ּڰ�" + min);
	}

}
