import java.util.Arrays;
import java.util.Scanner;

public class PreFes_20_12_23_3 {
	public static void main(String[] args) {

		// N*N �����

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); //
		int num2 = sc.nextInt(); // ��, �� 2���� �Է�

		int[][] arr;
		arr = new int[num1][num2]; // �������迭 ���� ���� �Է¹��� ���� ����.

		// ������ �迭

		int cnt = 1;

		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {

				arr[j][i] = cnt++;

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
