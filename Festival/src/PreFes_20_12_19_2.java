import java.util.Scanner;

public class PreFes_20_12_19_2 {
	public static void main(String[] args) {
		// a,b �Է¹ް� a-b ����ϰ� a,b �Ѵ� 0�϶� ����

		Scanner sc = new Scanner(System.in);

		int a = 0;   // 1. while �� �ȿ��� �Է¹��� �� ���� ������ while ������ �̸� ����
		int b = 0;

		while (true) {
			System.out.print("A �Է� >> ");
			a = sc.nextInt();
			System.out.print("B �Է� >> ");  // 2. �� ���� �Է� �ް�
			b = sc.nextInt();
			int m = a - b;                 // 3. �� ���� ���� �Է�

			if (a == 0 && b == 0) {  // �ݺ��� �� ���ǹ� 
				System.out.println(String.format("��� : %d", m));
				break;                      // a,b �Ѵ� 0 �϶� ����
			} else {                        // �ƴϸ� ��� ����
				System.out.println(String.format("��� : %d", m));
			}

		}

	}

}
