import java.util.Arrays;

public class PreFes_20_12_24_1 {
	public static void main(String[] args) {

		// 180��

		int[][] arr = new int[5][5];

		// ������ �迭

		int cnt = 1;

		System.out.println("����");

		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {

				arr[j][i] = cnt++;

			}
		}
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[j][i] + "\t");
			}
			System.out.println("");
		}

		System.out.println("================================================================");

		System.out.println("180�� ȸ��");  // �ݴ�� 25���� 1�� ���ָ� ��

		int cnt1 = 25;

		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {

				arr[j][i] = cnt1--;

			}
		}
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[j][i] + "\t");
			}
			System.out.println("");
		}

	}

}
