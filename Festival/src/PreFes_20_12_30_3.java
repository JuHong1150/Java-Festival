import java.util.Arrays;

public class PreFes_20_12_30_3 {
	public static void main(String[] args) {
		// 메소드 합병

		// 1. 두 배열의 길이를 활용해 병합 결과를 저장할 1차원 배열 생성

		int[] A = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int[] B = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int[] Merge = mergeArray(A, B);
		System.out.println(mergeArray(A, B)); 
		System.out.println("Merge : " + Arrays.toString(Merge));
	}
	private static int[] mergeArray(int[] a, int[] b) {

		int[] array = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			array[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			array[i + a.length] = b[i];
		}

		// 정렬(선택정렬 for)

		for (int k = 0; k < array.length - 1; k++) {
			int min = array[k];
			int minIndex = k;

			for (int i = k + 1; i < array.length; i++) {
				if (min > array[i]) {
					min = array[i];
					minIndex = i;
				}
			}
			int temp = array[k];
			array[k] = array[minIndex];
			array[minIndex] = temp;
		}
		return array;
	}

}
