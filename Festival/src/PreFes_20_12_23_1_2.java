import java.util.Arrays;
import java.util.Scanner;

public class PreFes_20_12_23_1_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  // 0.�Է¹ޱ�

		int[] arr = new int[5];  // 1. arr �迭 ���� + �Ʒ����� �Է��� ������ arr �� �����Ѵ�.

		for (int i = 0; i < 5; i++) {
			System.out.print(String.format("%d��° ���� >> ", i + 1));
			arr[i] = sc.nextInt();  // �Է��� ������ ���� ������ �迭�� �����Ѵ�.

		}
		
		  // 2. ��������

		for (int k = 0; k < arr.length - 1; k++) {
			int min = arr[k];
			int minIndex = k;

			for (int i = k + 1; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
					minIndex = i;
				}
			}
			int temp = arr[k];
			arr[k] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.print(Arrays.toString(arr));
		// System.out.println(Arrays.toString(arr)); �̰� for �� �ȿ� ���� �ٲ�� ������ ������

	}

}
