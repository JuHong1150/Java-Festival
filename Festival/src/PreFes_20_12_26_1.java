import java.util.Scanner;

public class PreFes_20_12_26_1 {
	public static void main(String[] args) {

		// 2���� �Է¹޾Ƽ� �Է��ϱ� ������ ������

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); //
		int num2 = sc.nextInt(); // ��, �� 2���� �Է�

		int[][] arr;
		arr = new int[num1][num2]; // �������迭 ���� ���� �Է¹��� ���� ����.

		// ������ �迭

		int cnt = 1;

		for (int i = 0; i < arr[0].length; i++) {
			if (i % 2 == 0) { // i ���� ¦�����϶���(0,2,4....��)
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = cnt++;
				}
			}
			else { // Ȧ���� (1,3,5,,,,,���϶���)
				for (int j = arr.length-1; j >= 0; j--) { // ��ü���̿��� -
					arr[i][j] = cnt++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
