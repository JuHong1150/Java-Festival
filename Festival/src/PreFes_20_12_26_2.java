import java.util.Arrays;

public class PreFes_20_12_26_2 {
	public static void main(String[] args) {

		// 2차원 90도
		
		System.out.println("원본");

		int[][] arr = new int[5][5];
		int cnt = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = cnt++;

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();

		}

		System.out.println("=================================================================");

		System.out.println("시계방향");

		int[][] arr1 = new int[5][5];
		int cnt1 = 1;

		for (int i = arr1.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr1.length; j++) {

				arr1[j][i] = cnt1++;

			}
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j] + "\t");

			}
			System.out.println();
		}

		System.out.println("=================================================================");
		
		System.out.println("반시계방향");
		
		int[][] arr2 = new int[5][5];
		int cnt2 = 1;

		for (int i = 0; i < arr2.length; i++) {
			for (int j = arr2.length - 1; j >= 0; j--) {

				arr2[j][i] = cnt2++;

			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[i][j] + "\t");    // [j][i] 로 쓰면 위의 for 문을 
				                                        //j를 고정하고 i를 변화시키면 된다.
			}
			System.out.println();
		}
	}

}
