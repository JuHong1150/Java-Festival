import java.util.Scanner;

public class PreFes_20_12_19_1_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���μ����� �� ���� �Է��Ͻÿ� >> ");
		int num = sc.nextInt();
		int i = 2; // 2. �ʱ⿡ ������ ���� 2��

		System.out.print(num + "=");
		while (true) { // 1. �ݺ��� ��������
			if (num % i == 0) { // 2. ���� i �� �Է��� ���ڰ� ������ �������� 0�̶�� �׳� ��� �̰ɷ� ������
				System.out.print(i);
				num = num / i;
				if (num == 1) { // 4. �׸��� ������ ���ڰ� 1�� �Ǹ� �����
					break;
				}
				System.out.print("*");
			} else { // 3. ���� �������� 0�� �ƴ϶�� i�� 1�� ���ؼ� ��������.
				i++;
			}
		}
	}

}
