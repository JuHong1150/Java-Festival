import java.util.Scanner;

public class PreFes_20_12_19_1_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���μ����� �� ���� �Է��Ͻÿ� >> ");
		int num = sc.nextInt();
		int i = 0;

		System.out.print(num + "=");
		for (i = 2; i <= num; i++) {// 1.���� i�� �Է¹��� num�� �������� 1�� ������ �����ϰ� 1�� ���������ϱ� 2���� �����Ŵ�.
			while (num % i == 0) { // 2.num�� �ʱ� 2�� �������� �������� 0�̶�� ��� 2�� ������,�ȳ������� ���� for������ �ö󰡼� +1 �Ѵ�.
				System.out.print(i);
				num = num / i;
				if (num == 1) {
					break;
				}

				System.out.print("*");
			}
		}

	}

}
