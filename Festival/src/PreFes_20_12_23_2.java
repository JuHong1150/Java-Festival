import java.util.Arrays;
import java.util.Scanner;

public class PreFes_20_12_23_2 {
	public static void main(String[] args) {

		// ���� ����

		Scanner sc = new Scanner(System.in); // 0.�Է¹ޱ�

		int[] arr = new int[5]; // 1. arr �迭 ���� + �Ʒ����� �Է��� ������ arr �� �����Ѵ�.

		for (int i = 0; i < 5; i++) {
			System.out.print(String.format("%d��° ���� >> ", i + 1));
			arr[i] = sc.nextInt(); // �Է��� ������ ���� ������ �迭�� �����Ѵ�.
		}
		
		
		// 2. ��������

		for (int i = 0; i < arr.length - 1; i++) { // 0>1 1>2 2>3 3>4
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		System.out.println("Step1");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 2; i++) { // 0>1 1>2 2>3
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}

		}
		System.out.println("step2");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 3; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;

			}
		}
		System.out.println("step3");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 4; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;

			}
		}
		System.out.println("step4");
		System.out.println(Arrays.toString(arr)); // ���� ��!

	}

}
