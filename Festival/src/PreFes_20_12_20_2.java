import java.util.Scanner;

public class PreFes_20_12_20_2 {
	public static void main(String[] args) {

		// �� ������ �Է¹޾� ������ ���� �ﰢ���� ����Ͻÿ�

		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է� >>");  // 0. �Է¹޴� ���� ����
		int n = sc.nextInt();
		
		for (int i = n; i >=1; i--) { // 1. i �� n���� 1�� �ɶ����� 1�� �ٿ����鼭 ������ �ۼ�
			for (int j = 1; j <= i; j++) { // 3. �� �ۼ� j�� 1���� i �� �������� ����
				System.out.print("*");	// 2.* �ϳ��� ��� ����!(println = ���η� ���پ� ����)
				                     //(2�� ln�� ����� ���η� n���� �ۼ���.)
			}System.out.println();   // �̰� ������ *************************�̷����ۼ���.�ٰ��� �ֱ� ���Ѱ�.
			
		}
		
		System.out.println("====================================================");

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <=i ; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
