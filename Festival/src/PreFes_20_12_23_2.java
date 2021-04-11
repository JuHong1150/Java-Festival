import java.util.Arrays;
import java.util.Scanner;

public class PreFes_20_12_23_2 {
	public static void main(String[] args) {

		// 버블 정렬

		Scanner sc = new Scanner(System.in); // 0.입력받기

		int[] arr = new int[5]; // 1. arr 배열 생성 + 아래에서 입력한 정수를 arr 에 저장한다.

		for (int i = 0; i < 5; i++) {
			System.out.print(String.format("%d번째 정수 >> ", i + 1));
			arr[i] = sc.nextInt(); // 입력한 정수를 위에 생성한 배열에 저장한다.
		}
		
		
		// 2. 버블정렬

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
		System.out.println(Arrays.toString(arr)); // 정렬 끝!

	}

}
