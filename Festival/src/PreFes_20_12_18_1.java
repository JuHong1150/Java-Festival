import java.util.Scanner;

public class PreFes_20_12_18_1 {
	public static void main(String[] args) {

		// ���� �Է¹޾� �ּҰ����, �ִ����� ���ϱ�
		// ����1,2 �� ū�� �� �������� ���� ��� ������ �� �������� �ٽ��ѹ� �������� ������ �������� 0�� �ɶ����� ������
		// �׶��� ������ = �ִ�����
		// ����1*����2�� �ִ� ������� ������ �ּҰ����

		Scanner sc = new Scanner(System.in);
		System.out.print("����1 �Է� >>");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� >>");
		int num2 = sc.nextInt();
		int big;    // ū �� 
		int small;  // ������
		
		int a = 0;  // ��
		int b = 0;  // ������

		int minGB;  // �ּҰ����
		int maxGY;  // �ִ�����

		if (num1 >= num2) { //���� �Է¹��� ���� num1>num2 ���
			big = num1;     // ū����  num1
			small = num2;   // �������� num2
		} else {
			big = num2;
			small = num1;   //�ƴ϶�� ���� �ݴ��
		}

		while (true) {
			a = big / small;  // ū������ �������� ���� ���� ��
			b = big - a * small;  // ū�� - ��*������ = ������
			if (b == 0) {
				maxGY = small;  // �� �������� 0�� �ɶ� �������� �ִ������� �ȴ�.
				minGB = num1 * num2 / maxGY; // �ּҰ������ �Է¹��� �� ���� ���� �ִ������� ���� ��.
				System.out.println("�ִ����� :" + maxGY);
				System.out.println("�ּҰ���� :" + minGB);
				break;
			} else {
				big = small;
				small = b;
			}
		}

	}

}
