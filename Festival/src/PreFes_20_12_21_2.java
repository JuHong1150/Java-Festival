import java.util.Random;

public class PreFes_20_12_21_2 {
	public static void main(String[] args) {

		// �ߺ����� �������� �̱�

		Random rd = new Random();
		int[] num = new int[6];  // 2. 6���� ���ڸ� ���߸� �Ǵ� ����̴�.
		int[] luck = new int[6];

		for (int i = 0; i < num.length; i++) {
			int daebak = rd.nextInt(45) + 1;  // 1. �ζǴ� 45���� ������ ���� �߿��� 
			num[i] = daebak;  // 3. ���������� 6���� ���ڸ� ���� num�� �����Ѵ���
			for (int j = 0; j < num.length; j++) {
				int daebak2 = rd.nextInt(45) + 1;
				luck[j] = daebak2;  // 4. luck���� ���� num�� ���� ������� �����ϰ�

				if (num[i] == luck[j]) {  // 5. �� ���� ���Ͽ�
					num[i] -= num[i];  // ���� ���ٸ� i ���� ��������.
					break;
				}

			}
			System.out.println("�̹��ִ� �ʷ� ���ߴ�!! >>" + daebak);// 6. �ߺ����� ������ �������� ���
		}

	}

}
