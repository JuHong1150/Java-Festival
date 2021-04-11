import java.util.Arrays;
import java.util.Scanner;

public class PreFes_20_12_23_1_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  // 0.입력받기

		int[] arr = new int[5];  // 1. arr 배열 생성 + 아래에서 입력한 정수를 arr 에 저장한다.

		for (int i = 0; i < 5; i++) {
			System.out.print(String.format("%d번째 정수 >> ", i + 1));
			arr[i] = sc.nextInt();  // 입력한 정수를 위에 생성한 배열에 저장한다.

		}
		
		  // 2. 선택정렬

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
		// System.out.println(Arrays.toString(arr)); 이걸 for 문 안에 쓰면 바뀌는 순서를 보여줌

	}

}
